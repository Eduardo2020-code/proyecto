/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.vo.DatosEmpleados;
import model.vo.DatosSedes;
import util.JDBCUtilities;

/**
 *
 * @author usuario
 */
public class DatosSedesDao {
    
    public ArrayList<DatosSedes> listaSedes(){
        
        ArrayList<DatosSedes> respuesta = new ArrayList<>();
        Connection conexion = null;
        JDBCUtilities conex = new JDBCUtilities();
        
        try{
            conexion= conex.getConnection();
            
            String query = "SELECT id_sede, dir_sede, barrio_sede, ciudad_sede, tel_sede FROM sede";
            
            PreparedStatement statement = conexion.prepareStatement(query);
            ResultSet resultado = statement.executeQuery();
            
            while(resultado.next()){
                DatosSedes consulta = new DatosSedes();
                consulta.setId_sede(resultado.getString(1));
                consulta.setDireccion_sede(resultado.getString(2));
                consulta.setBarrio_sede(resultado.getString(3));
                consulta.setCiudad_sede(resultado.getString(4));
                consulta.setTelefono_sede(resultado.getString(5));
              
                
                respuesta.add(consulta);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en la consulta " + e);
        }
        return respuesta;
    }
    
    public DatosSedes actualizarSede(DatosSedes modificarSede ) throws SQLException{
        DatosSedes sedeActualizar = null;
        Connection conexion = null;
        JDBCUtilities conex = new JDBCUtilities();
        
        try{
            conexion= conex.getConnection();

            String consulta = "UPDATE sede SET dir_sede=?,barrio_Sede=?,cuidad_Sede=?,tel_sede=? where idSede=? ";

            PreparedStatement statement = conexion.prepareStatement(consulta);

            statement.setString(1, modificarSede.getDireccion_sede());
            statement.setString(2, modificarSede.getBarrio_sede());
            statement.setString(3, modificarSede.getCiudad_sede());
            statement.setString(4, modificarSede.getTelefono_sede());
            
           
             
            statement.setInt(5, (int) Integer.parseInt((String) modificarSede.getId_sede()));
            
         

            //Realizar la actualización: Crear material
            statement.executeUpdate();

            //Cerrar interacciones con BD            
            statement.close();

            //Si el proceso fue exitoso cambiar el estado
            sedeActualizar = modificarSede;

        }catch(SQLException e){
            System.err.println("Error actualizando sede! "+e);
        }finally{
            //Cierre del controlador
            if(conexion != null){
                conexion.close();
            }
        }

        //Retornar la instancia del material o el nulo para validaciones posteriores
        return sedeActualizar; 
    }
   public DatosSedes modificarBarrioSede(DatosSedes modificarBarrioSede ) throws SQLException{
        DatosSedes barrioActualizar = null;
        Connection conexion = null;
        JDBCUtilities conex = new JDBCUtilities();
        
        try{
            conexion= conex.getConnection();

            String consulta = "UPDATE sede SET, barrio_Sede=?, where idSede=? ";

            PreparedStatement statement = conexion.prepareStatement(consulta);

           
            statement.setString(1, modificarBarrioSede.getBarrio_sede());
           
           
            statement.setInt(2, (int) Integer.parseInt((String) modificarBarrioSede.getId_sede()));
            

            //Realizar la actualización: Crear material
            statement.executeUpdate();

            //Cerrar interacciones con BD            
            statement.close();

            //Si el proceso fue exitoso cambiar el estado
            barrioActualizar = modificarBarrioSede;

        }catch(SQLException e){
            System.err.println("Error actualizando sede! "+e);
        }finally{
            //Cierre del controlador
            if(conexion != null){
                conexion.close();
            }
        }

        //Retornar la instancia del material o el nulo para validaciones posteriores
        return barrioActualizar;
    }
   
   public DatosSedes modificarCuidadSede(DatosSedes modificarCuidadSede ) throws SQLException{
        DatosSedes cuidadActualizar = null;
        Connection conexion = null;
        JDBCUtilities conex = new JDBCUtilities();
        
        try{
            conexion= conex.getConnection();

            String consulta = "UPDATE sede SET cuidad_Sede=? where idSede=? ";

            PreparedStatement statement = conexion.prepareStatement(consulta);

           
            statement.setString(1, modificarCuidadSede.getCiudad_sede());
            
            statement.setInt(2, (int) Integer.parseInt((String) modificarCuidadSede.getId_sede()));
            

            //Realizar la actualización: Crear material
            statement.executeUpdate();

            //Cerrar interacciones con BD            
            statement.close();

            //Si el proceso fue exitoso cambiar el estado
            cuidadActualizar = modificarCuidadSede;

        }catch(SQLException e){
            System.err.println("Error actualizando sede! "+e);
        }finally{
            //Cierre del controlador
            if(conexion != null){
                conexion.close();
            }
        }

        //Retornar la instancia del material o el nulo para validaciones posteriores
        return cuidadActualizar; 
}
 public DatosSedes modificarTelefonoSede(DatosSedes modificarTelefonoSede ) throws SQLException{
        DatosSedes telefonoActualizar = null;
        Connection conexion = null;
        JDBCUtilities conex = new JDBCUtilities();
        
        try{
            conexion= conex.getConnection();

            String consulta = "UPDATE sede SET dir_sede=?,barrio_Sede=?,cuidad_Sede=?,tel_sede=? where idSede=? ";

            PreparedStatement statement = conexion.prepareStatement(consulta);

            
            statement.setString(1, modificarTelefonoSede.getTelefono_sede());
            
           
            statement.setInt(2, (int) Integer.parseInt((String) modificarTelefonoSede.getId_sede()));
            

            //Realizar la actualización: Crear material
            statement.executeUpdate();

            //Cerrar interacciones con BD            
            statement.close();

            //Si el proceso fue exitoso cambiar el estado
            telefonoActualizar = modificarTelefonoSede;

        }catch(SQLException e){
            System.err.println("Error actualizando sede! "+e);
        }finally{
            //Cierre del controlador
            if(conexion != null){
                conexion.close();
                 }
            }
            //Retornar la instancia del material o el nulo para validaciones posteriores
        return telefonoActualizar;
 
}

 public DatosSedes modificarDireccionSede(DatosSedes modificarDireccionSede ) throws SQLException{
        DatosSedes direccionActualizar = null;
        Connection conexion = null;
        JDBCUtilities conex = new JDBCUtilities();
        
        try{
            conexion= conex.getConnection();

            String consulta = "UPDATE sede SET dir_sede=? where idSede=? ";

            PreparedStatement statement = conexion.prepareStatement(consulta);

            
            statement.setString(1, modificarDireccionSede.getDireccion_sede());
            
           
            statement.setInt(2, (int) Integer.parseInt((String) modificarDireccionSede.getId_sede()));
            

            //Realizar la actualización: Crear material
            statement.executeUpdate();

            //Cerrar interacciones con BD            
            statement.close();

            //Si el proceso fue exitoso cambiar el estado
            direccionActualizar = modificarDireccionSede;

        }catch(SQLException e){
            System.err.println("Error actualizando sede! "+e);
        }finally{
            //Cierre del controlador
            if(conexion != null){
                conexion.close();
                 }
            }
            //Retornar la instancia del material o el nulo para validaciones posteriores
        return direccionActualizar;
 
}

}