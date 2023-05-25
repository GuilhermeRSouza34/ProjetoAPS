package Main.Controlers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Controlers {

    public static void insertDB() {
        Connection c = null;
        Statement stmt = null;
        try {

            c = DriverManager.getConnection("jdbc:sqlite:C:/Users/Guilherme/Downloads/programas/sqlite-tools-win32-x86-3420000/sqlite-tools-win32-x86-3420000/database");
            c.setAutoCommit(false);
            System.out.println("Sucesso na conexão");

            stmt = c.createStatement();
            String sql = "INSERT INTO usuarios (nome,email)";
            stmt.executeUpdate(sql);
            stmt.close();
            c.commit();
            c.close();
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Usuario adicionado com sucesso");
    }

    public static void selectDB() {
        Connection c = null;
        Statement stmt = null;
        try {

            c = DriverManager.getConnection("jdbc:sqlite:C:/Users/Guilherme/Downloads/programas/sqlite-tools-win32-x86-3420000/sqlite-tools-win32-x86-3420000/database");
            c.setAutoCommit(false);
            System.out.println("Sucesso na Conexão");
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM usuarios;");
            while (rs.next()) {
                int codigo = rs.getInt("codigo");
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                System.out.println("codigo : " + codigo);
                System.out.println("Nome : " + nome);
                System.out.println("email : " + email);
                System.out.println();
            }
            rs.close();
            stmt.close();
            c.close();
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Sucesso na Operação");
    }

    public static void updateDB() {
        Connection c = null;
        Statement stmt = null;
        try {
            c = DriverManager.getConnection("jdbc:sqlite:C:/Users/Guilherme/Downloads/programas/sqlite-tools-win32-x86-3420000/sqlite-tools-win32-x86-3420000/database");
            System.out.println("Sucesso na Conexão");

            stmt = c.createStatement();
            String sql = "UPDATE cursos set nome = ''";
            stmt.executeUpdate(sql);
            c.commit();

            ResultSet rs = stmt.executeQuery("SELECT * FROM cursos;");
            while (rs.next()) {
                int codigo = rs.getInt("codigo");
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                System.out.println("codigo : " + codigo);
                System.out.println("Nome : " + nome);
                System.out.println("email : " + email);
                System.out.println();
            }
            rs.close();
            stmt.close();
            c.close();
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Sucesso na Operação");
    }
}
