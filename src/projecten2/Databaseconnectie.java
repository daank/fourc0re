
package projecten2;

import java.awt.List;
import java.sql.*;
import java.util.ArrayList;
@SuppressWarnings("unused")
public class Databaseconnectie {
           Connection connection = null;
        Statement statement = null;    
        ResultSet resultset = null;
       
       // connecteren naar de database
    	public boolean connectToDatabase(){
    		boolean success = true;
    		try {
    	        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    	        connection = DriverManager.getConnection("jdbc:odbc:DBProject");
    	        System.out.println("> Databank connectie geslaagd!");
    	        } catch (SQLException e) {
    	            System.out.println("(!) SQL Exception: "+ e.toString());
    	            success = false; // success is gefaald
    	        } catch (ClassNotFoundException cE) {
    	            System.out.println("(!) Class Not Found Exception: "+
    	                cE.toString());
    	            success = false;  // success is gefaald
    	        }
    		return success; // success is gelukt
    	}
    	  	
    	// connectie sluiten
    	public void closeConnection() throws SQLException{
    			connection.close();
    	         connection = null;
    	         statement = null;    
    	         resultset = null;
    			System.out.println("> Databank connectie gesloten!");
    	} 
        
        public Event leesEvents(Event tempEvent) throws SQLException
        {
           //tempReturnEvent aanmaken als object Event
    		Event tempReturnEvent = new Event();
                    			
    			try {
        		connectToDatabase(); 
        		// we gebruiken de studentID als zoekwaarde
        		statement = connection.createStatement();
        		resultset = statement.executeQuery("SELECT * FROM tblEvent");
        		System.out.println("Events:");
        		connection.setAutoCommit(true);
        		
        		//qry uitvoere   
        		while (resultset.next())
        		{
        			// je kan ook het id van de collom nemen, bv "0" voor de kolom IdStudent
        			tempReturnEvent.setIdMelding(resultset.getInt("IdMelding")); 
        			tempReturnEvent.setTitel(resultset.getString("Titel"));
        			tempReturnEvent.setDatum(resultset.getString("Datum"));
        			tempReturnEvent.setTijdstip(resultset.getString("Tijdstip"));
        			tempReturnEvent.setType(resultset.getString("Type"));
                                tempReturnEvent.setOmschrijving(resultset.getString("Omschrijving"));
        			    		
        		} 
        		
        		} catch (SQLException e){
        			e.printStackTrace();
        			System.out.println("Fout bij het opzoeken van de student (DataBase fout)");	
        			closeConnection();
        		}
    			//conn closen
                        System.out.println(tempReturnEvent.toString());
        		closeConnection();
        		return tempReturnEvent;
        }
        
        //Situatie toevoegen
        public void situatieToevoegen(Situatie tempSituatie) throws SQLException{
    		try {
    		connectToDatabase();
    		
    		// id bepalen van laatst toegevoegde student (hoogsten studentid)
                
                /*
    		int maxMeldingId = 0;
    		statement = connection.createStatement();
    		resultset = statement.executeQuery("SELECT MAX(tblMelding_idMelding) FROM tblSituatie");
    		resultset.next();
    		maxMeldingId = resultset.getInt(1);
    		*/
    		
    		// student aanmaken
    		statement = null;
    		PreparedStatement prepSituatieToevoegen = connection.prepareStatement("INSERT INTO tblSituatie(titel, type, omschrijving) VALUES (?, ?, ?)");		
    		//prepSituatieToevoegen.setInt(1,maxMeldingId+1);
    		prepSituatieToevoegen.setString(1, tempSituatie.getTitel());
    		prepSituatieToevoegen.setString(2, tempSituatie.getType().toString());
    		prepSituatieToevoegen.setString(3, tempSituatie.getOmschrijving());
    		
    		
    		connection.setAutoCommit(true);
    		System.out.println("Situatie toegevoegd: "  + tempSituatie.getTitel().toString() + tempSituatie.getType().toString() + tempSituatie.getOmschrijving().toString() );
    		//qry uitvoeren
    		prepSituatieToevoegen.execute();
    		
    		
    		} catch (SQLException e){
    			e.printStackTrace();
    			System.out.println("De connectie is mislukt. DB connectie wordt afgesloten");
    			closeConnection();
    		}
    		//conn closen
    		closeConnection();
}
           	public Situatie situatieOpvragen(Situatie tempSituatie) throws SQLException{
			// we krijgen de zoekwaarde via tempStudent, en sturen de geretourneerde gegevens	
    		// door via tempReturnStudent terug naar de gui
    		Situatie tempReturnSituatie = new Situatie();
     			
    			try {
        		connectToDatabase(); 
        		
        		statement = connection.createStatement();
        		resultset = statement.executeQuery("SELECT * FROM tblSituatie");
        		System.out.println("Situaties:");
        		connection.setAutoCommit(true);
        		//qry uitvoere   
                       
                        
        		while (resultset.next())
        		{       
        	  		tempReturnSituatie.setTitel(resultset.getString("Titel"));
        			tempReturnSituatie.setType(SType.valueOf("Type"));
        			tempReturnSituatie.setOmschrijving(resultset.getString("Omschrijving"));
        		            
        		} 
        		
        		} catch (SQLException e){
        			e.printStackTrace();
        			System.out.println("Fout bij het lezen van situaties (DataBase fout)");	
        			closeConnection();
        		}
    			//conn closen
        		closeConnection();
        		return tempReturnSituatie;
    	}
}

package projecten2;

import java.sql.*;
@SuppressWarnings("unused")
public class Databaseconnectie {
           Connection connection = null;
        Statement statement = null;    
        ResultSet resultset = null;
       
       // connecteren naar de database
    	public boolean connectToDatabase(){
    		boolean success = true;
    		try {
    	        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    	        connection = DriverManager.getConnection("jdbc:odbc:DBProject");
    	        System.out.println("> Databank connectie geslaagd!");
    	        } catch (SQLException e) {
    	            System.out.println("(!) SQL Exception: "+ e.toString());
    	            success = false; // success is gefaald
    	        } catch (ClassNotFoundException cE) {
    	            System.out.println("(!) Class Not Found Exception: "+
    	                cE.toString());
    	            success = false;  // success is gefaald
    	        }
    		return success; // success is gelukt
    	}
    	  	
    	// connectie sluiten
    	public void closeConnection() throws SQLException{
    			connection.close();
    	        Connection connection = null;
    	        Statement statement = null;    
    	        ResultSet resultset = null;
    			System.out.println("> Databank connectie gesloten!");
    	} 
        
        public Event leesEvents(Event tempEvent) throws SQLException
        {
           //tempReturnEvent aanmaken als object Event
    		Event tempReturnEvent = new Event();
                    			
    			try {
        		connectToDatabase(); 
        		// we gebruiken de studentID als zoekwaarde
        		statement = connection.createStatement();
        		resultset = statement.executeQuery("SELECT * FROM tblEvent");
        		System.out.println("Events:");
        		connection.setAutoCommit(true);
        		
        		//qry uitvoere   
        		while (resultset.next())
        		{
        			// je kan ook het id van de collom nemen, bv "0" voor de kolom IdStudent
        			tempReturnEvent.setIdMelding(resultset.getInt("IdMelding")); 
        			tempReturnEvent.setTitel(resultset.getString("Titel"));
        			tempReturnEvent.setDatum(resultset.getString("Datum"));
        			tempReturnEvent.setTijdstip(resultset.getString("Tijdstip"));
        			tempReturnEvent.setType(resultset.getString("Type"));
                                tempReturnEvent.setOmschrijving(resultset.getString("Omschrijving"));
        			    		
        		} 
        		
        		} catch (SQLException e){
        			e.printStackTrace();
        			System.out.println("Fout bij het opzoeken van de student (DataBase fout)");	
        			closeConnection();
        		}
    			//conn closen
                        System.out.println(tempReturnEvent.toString());
        		closeConnection();
        		return tempReturnEvent;
        }
        
        //Situatie toevoegen
        public void situatieToevoegen(Situatie tempSituatie) throws SQLException{
    		try {
    		connectToDatabase();
    		
    		// id bepalen van laatst toegevoegde student (hoogsten studentid)
    		int maxMeldingId = 0;
    		statement = connection.createStatement();
    		resultset = statement.executeQuery("SELECT MAX(idMelding) FROM tblSituatie");
    		resultset.next();
    		maxMeldingId = resultset.getInt(1);
    		
    		
    		// student aanmaken
    		statement = null;
    		PreparedStatement prepSituatieToevoegen = connection.prepareStatement("INSERT INTO tblSituatie(idMelding, Titel, Type, Omschrijving) VALUES (?, ?, ?, ?)");		
    		prepSituatieToevoegen.setInt(1,maxMeldingId+1);
    		prepSituatieToevoegen.setString(2, tempSituatie.getTitel());
    		prepSituatieToevoegen.setString(3, tempSituatie.getType());
    		prepSituatieToevoegen.setString(4, tempSituatie.getOmschrijving());
    		
    		
    		connection.setAutoCommit(true);
    		System.out.println("Situatie toegevoegd: "+tempSituatie.toString());
    		//qry uitvoeren
    		prepSituatieToevoegen.execute();
    		
    		
    		} catch (SQLException e){
    			e.printStackTrace();
    			System.out.println("De connectie is mislukt. DB connectie wordt afgesloten");
    			closeConnection();
    		}
    		//conn closen
    		closeConnection();
}
}
