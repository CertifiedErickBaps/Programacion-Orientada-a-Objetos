/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;


/**
 *
 * @author A01374009
 */
public class Retiro extends Transaccion{
    private int monto; // monto a retirar de la cuenta
    private Teclado teclado; // Teclado del Cajero
    private DispensadorEfectivo dispensadorEfectivo; //Dispensador de dinero del Cajero
   
    private final static int CANCELADO = 7;

    public Retiro(int usuarioCuentaNumero, Screen atmScreen, BankDataBase atmBankDataBase, Teclado atmTeclado, DispensadorEfectivo atmDispensadorEfectivo) {
        super(usuarioCuentaNumero, atmScreen, atmBankDataBase);
        teclado = atmTeclado;
        dispensadorEfectivo = atmDispensadorEfectivo;
    }
    
    @Override
    public void execute(){
        boolean dispensadorEfectivoR = false;
        double balanceDisponible;
        
        BankDataBase bankDataBase = getBankDataBase();
        Screen screen = getScreen();
        
        do{
            monto = displayMenuMontos();
            
            if(monto != CANCELADO){
                balanceDisponible = bankDataBase.getBalanceDisponible(getCuentaNumero());
                if(monto <= balanceDisponible){
                    if(dispensadorEfectivo.suficienteEfectivo(monto)){
                        bankDataBase.debito(getCuentaNumero(), monto);
                        dispensadorEfectivo.DispensadoEfectivo(monto);
                        dispensadorEfectivoR = true;
                        
                        screen.displayMessageLine("\nTu dinero ha sido dispensado. Porfavor toma tu dinero ahora.");    
                    }else{
                        screen.displayMessageLine("\nDinero insuficiente en el ATM" + "\n\nPorfavor elije una cantidad mas pequeña.");
                    }
                }else{
                    screen.displayMessageLine("\nFondos insuficientes en tu cuenta."+"\n\nPorfavor elige una cantidad mas pequeña.");
                }
            }else{
                screen.displayMessageLine("\nCancelando transaccion....");
                return;
            }
        } while(!dispensadorEfectivoR);
    }
    
    private int displayMenuMontos(){
        int usuarioEleccion = 0;
        
        Screen screen = getScreen();
        
        @SuppressWarnings("MismatchedReadAndWriteOfArray")
        int[] montos = {0, 20, 40, 60, 100, 200, 500};
        
        while (usuarioEleccion == 0){
            screen.displayMessageLine("\nMenu de retiro:");
            screen.displayMessageLine("\n1 - $20");
            screen.displayMessageLine("\n2 - $40");
            screen.displayMessageLine("\n3 - $60");
            screen.displayMessageLine("\n4 - $100");
            screen.displayMessageLine("\n5 - $200");
            screen.displayMessageLine("\n6 - $500");
            screen.displayMessageLine("\n7 - Transaccion cancelada");
            screen.displayMessage("\nElije un monto para retirar: ");
            
            int input = teclado.getInput();
            switch(input){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    usuarioEleccion = montos[input];
                    break;
                case CANCELADO:
                    usuarioEleccion = CANCELADO;
                    break;
                default:
                    screen.displayMessageLine("\nSeleccion invalida. Intenta de nuevo.");
            }
            
        }
        return usuarioEleccion;
    }
    
    
}
