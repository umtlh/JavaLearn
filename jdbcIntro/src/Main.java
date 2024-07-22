import java.sql.*;



public class Main {

        public static <Country> void main(String[] args) throws SQLException{
            Connection connection =null;
            DbHelper helper = new DbHelper();
            Statement statement = null;
            ResultSet resultSet;
            try{
                connection = helper.getConnection();
                statement = connection.createStatement();
                resultSet = statement.executeQuery("select country from sakila.country");

                while (resultSet.next()){
                    System.out.println(resultSet.getString("Country"));
                }

            } catch (SQLException exception) {
                helper.showErrorMessage(exception);
            }
            finally {
                connection.close();
            }
        }
}