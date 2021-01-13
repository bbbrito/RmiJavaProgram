package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface Servico extends Remote {
        public ArrayList<String> getPessoas() throws RemoteException;
        public ArrayList<String> getPessoasFrom(String coluna, String string) throws RemoteException;
        public ArrayList<String> getPessoa(String string) throws RemoteException;
        public void updateCandidato(ArrayList<String> dados, String email) throws RemoteException;
}
