package ClientToServer;

import Utility.Operation;

//Messaggio Client->Server per il login di un utente
public class Login extends MessageType{
    public final String username;
    public final String password;
    public Login(String username, String password)
    {
        this.username = username;
        this.password = password;
    }
    @Override
    public Operation getOperation()
    {
        return Operation.login;
    }
}
