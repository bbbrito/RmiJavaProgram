package rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.LocateRegistry;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class Servidor extends UnicastRemoteObject implements Servico{

	private static final long serialVersionUID = 1L;

	protected Servidor() throws RemoteException {
		super();
	}

	public static void main(String[] args) throws SQLException {
		try {                                            
			LocateRegistry.createRegistry(1232);
			Servidor servidor = new Servidor();
			String localizacao = "//localhost:1232/servico";
			Naming.rebind(localizacao, servidor);
		} catch (MalformedURLException e) {
			System.out.println("Erro de URL mal formada: "+e.getMessage());
		} catch (RemoteException e) {
			System.out.println("Erro: "+e.getMessage());
		}
		
	}
        
        @Override
	public ArrayList<String> getPessoas() throws RemoteException {
            Conexao con;
            ArrayList<String> retorno = new ArrayList();
            try {             
                con = new Conexao();
                Statement st = con.conexao.createStatement();
                String query = "SELECT * FROM candidato";
                ResultSet rs;
                rs = st.executeQuery(query);
                while (rs.next()){
                    //retorno = rs.getString("nome");                 
                    retorno.add(rs.getString("nome"));
                    retorno.add(rs.getString("sobrenome"));
                    retorno.add(rs.getString("email"));                   
                    retorno.add(rs.getString("residencia"));
                    retorno.add(rs.getString("formacao"));
                    retorno.add(rs.getString("habilidades"));
                    retorno.add(rs.getString("experiencia1"));
                    retorno.add(rs.getString("experiencia2"));
                    retorno.add(rs.getString("experiencia3"));
                    //retorno.add(rs.getString("foto"));
                }
            } catch (ClassNotFoundException | SQLException ex) {
                System.out.println("Erro: "+ex.getMessage());
                //retorno = "Erro: "+ex.getMessage();
            }
            return retorno;
	}
        
        @Override
	public ArrayList<String> getPessoasFrom(String coluna, String string) throws RemoteException {
            Conexao con;
            ArrayList<String> retorno = new ArrayList();
            try {             
                con = new Conexao();
                Statement st = con.conexao.createStatement();
                String query = "SELECT * FROM candidato WHERE " + coluna + " LIKE '%" + string + "%'";
                ResultSet rs;
                rs = st.executeQuery(query);
                while (rs.next()){
                    retorno.add(rs.getString("nome"));
                    retorno.add(rs.getString("sobrenome"));
                    retorno.add(rs.getString("email"));                   
                    retorno.add(rs.getString("residencia"));
                    retorno.add(rs.getString("formacao"));
                    retorno.add(rs.getString("habilidades"));
                    retorno.add(rs.getString("experiencia1"));
                    retorno.add(rs.getString("experiencia2"));
                    retorno.add(rs.getString("experiencia3"));
                }
            } catch (ClassNotFoundException | SQLException ex) {
                System.out.println("Erro: "+ex.getMessage());
            }
            return retorno;
	}
        
        @Override
	public ArrayList<String> getPessoa(String string) throws RemoteException {
            Conexao con;
            ArrayList<String> retorno = new ArrayList();
            try {             
                con = new Conexao();
                Statement st = con.conexao.createStatement();
                String query = "SELECT * FROM candidato WHERE email = '" + string + "'";
                ResultSet rs;
                rs = st.executeQuery(query);
                while (rs.next()){
                    retorno.add(rs.getString("email"));
                    retorno.add(rs.getString("nome"));
                    retorno.add(rs.getString("sobrenome"));                                      
                    retorno.add(rs.getString("residencia"));
                    retorno.add(rs.getString("formacao"));
                    retorno.add(rs.getString("habilidades"));
                    retorno.add(rs.getString("experiencia1"));
                    retorno.add(rs.getString("experiencia2"));
                    retorno.add(rs.getString("experiencia3"));
                }
            } catch (ClassNotFoundException | SQLException ex) {
                System.out.println("Erro: "+ex.getMessage());
            }
            return retorno;
	}
        
        @Override
	public void updateCandidato(ArrayList<String> dados, String email) throws RemoteException {
            Conexao con;
            ArrayList<String> candidato = dados;
            ArrayList<String> retorno = new ArrayList();
            String query = "UPDATE candidato SET email='" + candidato.get(0) + "', nome='" + candidato.get(1) + "', sobrenome='" + candidato.get(2) + "', residencia='" + candidato.get(3) + "', formacao='" + candidato.get(4) + "', habilidades='" + candidato.get(5) + "', experiencia1='" + candidato.get(6) + "', experiencia2='" + candidato.get(7) + "', experiencia3='" + candidato.get(8) + "' WHERE email='"+ email + "'";
            try {             
                con = new Conexao();
                Statement st = con.conexao.createStatement();
                st.execute(query);

                System.out.println("Tudo certo!");
            } catch (ClassNotFoundException | SQLException ex) {
                System.out.println("Erro: "+ex.getMessage());
            }
	}
}

