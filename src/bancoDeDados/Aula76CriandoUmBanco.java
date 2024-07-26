package bancoDeDados;

import java.sql.*;

public class Aula76CriandoUmBanco {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/java";
        String usuario = "postgres";
        String senha = "nick@posto";

        try (
//        Class.forName("org.postgresql.Driver");
        Connection conexao = DriverManager.getConnection(url, usuario, senha);
        PreparedStatement pesquisa = conexao.prepareStatement(
                "SELECT * from pessoas"
        );
        ResultSet resultado = pesquisa.executeQuery()) {

            System.out.println("Conexão realizada com sucesso!");


        while (resultado.next()) {

            String nome = resultado.getString("nome");
            String idade = resultado.getString("idade");
            System.out.println("Nome: " + nome + "\nIdade: " + idade);
        }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        }

}
