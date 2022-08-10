package com.company;
import com.company.Conex;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Comand implements ComandDAO{

    Conex conex = new Conex();

    public String nome;
    public String numReserva;
    public String dataEntrada;
    public int diasPerm, atualizar;
    public int excluir; // Usar somente no delete.

    public double pagamento = 0.00;

    @Override
    public void create(){

        Connection conn = null;
        PreparedStatement st = null;

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        try{
            conn = conex.conex();
            st = conn.prepareStatement("INSERT INTO Cortez.Cliente" +
                    "(Nome, NumReserva, DataEntrada, DiasPerm, Pay)" +
                    "VALUES" +
                    "(?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);

            st.setString(1, nome);
            st.setString(2, numReserva);
            st.setDate(3, new java.sql.Date(sdf.parse(dataEntrada).getTime()));
            st.setInt(4, diasPerm);
            st.setDouble(5, pagamento);

            int rowsAffected = st.executeUpdate();

            System.out.println("Rows Affected: " + rowsAffected);


        }catch(SQLException | ParseException e){
            e.printStackTrace();
        }finally {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                st.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }

    }

    @Override
    public void read(){

        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        try{
            conn = conex.conex();
            st = conn.createStatement();
            rs = st.executeQuery("SELECT * FROM Cortez.Cliente");

            while(rs.next()){
                System.out.println(rs.getInt("id") + ", " + rs.getString("Nome") +
                        ", " + rs.getString("NumReserva") + ", " + rs.getString("DataEntrada") +
                        ", " + rs.getString("DiasPerm") + ", " + rs.getString("Pay"));

            }

        }catch(SQLException e){
            e.printStackTrace();
        }finally {
            try {
                st.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                rs.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }

    @Override
    public void update(){

        Connection conn = null;
        PreparedStatement st = null;

        try{
            conn = conex.conex();
            st = conn.prepareStatement("UPDATE Cortez.Cliente " +
                    "SET Pay = Pay + ? " +
                    "WHERE " +
                    "(id = ?) ");

            st.setDouble(1, pagamento);
            st.setInt(2, atualizar);



            int rowsAffected = st.executeUpdate();

            System.out.println("Rows Affected: " + rowsAffected);

        }catch(SQLException e){
            e.printStackTrace();
        }finally {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                st.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }

    @Override
    public void delete(){

        Connection conn = null;
        PreparedStatement st = null;

        try{
            conn = conex.conex();
            st = conn.prepareStatement("DELETE FROM Cortez.Cliente " +
                    "WHERE " +
                    "id = ? ");

            st.setInt(1, excluir);

            int rowsAffected = st.executeUpdate();

            System.out.println("Rows Affected: " + rowsAffected);

        }catch(SQLException e){
            e.printStackTrace();
        }finally {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                st.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }

    }

    public void showCrud(){

        System.out.println("1 - Inserir dados. ");
        System.out.println("2 - Ler dados. ");
        System.out.println("3 - Atualizar dados. ");
        System.out.println("4 - Excluir dados. ");

    }

}
