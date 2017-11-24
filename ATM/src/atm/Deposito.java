/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

/**
 *
 * @author ERICK
 */
public class Deposito extends Transaccion{
    private double monto;
    private Teclado teclado;
    private DepositeSlot depositeSlot;
    private final static int CANCELED = 0;

    public Deposito(int usuarioCuentaNumero, Screen atmScreen, BankDataBase atmBankDataBase, Teclado atmTeclado, DepositeSlot atmDepositeSlot) {
        super(usuarioCuentaNumero, atmScreen, atmBankDataBase);
        
        teclado = atmTeclado;
        depositeSlot = atmDepositeSlot;
    }
    
    @Override
    public void execute(){
        BankDataBase bankDataBase = getBankDataBase();
        Screen screen = getScreen();
        monto = solicitarDepositoMonto();
        
        if(monto != CANCELED){
            screen.displayMessage("\nPorfavor inserte un sobre de deposito");
            screen.displayDollarMonto(monto);
            screen.displayMessageLine(".");
            
            boolean sobreRecibido = depositeSlot.sobreRecibido();
         
            if(sobreRecibido){
                screen.displayMessageLine("\nTu sobre ha sido" + "recibido.\nNota: El dinero que caba de depositar no estara " + "disponible hasta que verifiquemos el monto de cualquier " + "efectivo en caja y sus cheques sin cargo.");
                bankDataBase.credito(getCuentaNumero(), monto);
            }else{
                screen.displayMessageLine("\nNo inserto un sobre, " + "por lo que el ATM ha cancelado su transaccion");
            }
        }else{
            screen.displayMessageLine("\nCancelando transaccion...");
        }
    }
    
    private double solicitarDepositoMonto(){
        Screen screen = getScreen();
        screen.displayMessage("\nPorfavor deposite un monto en (o 0 para cancelar)");
        int input = teclado.getInput();
        
        if(input == CANCELED){
            return CANCELED;
        }else{
            return (double)input;
        }
    }
    
}
