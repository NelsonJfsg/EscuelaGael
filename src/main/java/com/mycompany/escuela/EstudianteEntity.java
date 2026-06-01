package com.mycompany.escuela;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EstudianteEntity {
    
    public static void createEstudiante (Estudiante estudiante) {
        
        String query = "INSERT INTO Estudiante (nombres, apellidos) VALUES (?, ?)";
        
        try (
            Connection conn = Conexion.conectar();
            PreparedStatement ps = conn.prepareStatement(query)
        ) {

            ps.setString(1, estudiante.getNombres());
            ps.setString(2, estudiante.getApellidos());

            ps.executeUpdate();

            System.out.println("Estudiante insertado con exito");

        } catch (Exception e) {
            System.out.println("Algo fallo al insertar el estudiante: " + e);
            e.printStackTrace();
        }
    }
    
    public static Estudiante readEstudiante (int clave) {
        
        String query = "SELECT * FROM Estudiante WHERE clave = ?";

        try (
            Connection conn = Conexion.conectar();
            PreparedStatement ps = conn.prepareStatement(query)
        ) {

            ps.setInt(1, clave);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                Estudiante estudiante = new Estudiante(0, "", "");

                estudiante.setClave(rs.getInt("clave"));
                estudiante.setNombres(rs.getString("nombres"));
                estudiante.setApellidos(rs.getString("apellidos"));

                return estudiante;
            }

        } catch (Exception e) {
            System.out.println("Error al consultar estudiante: " + e);
            e.printStackTrace();
        }

        return null;
    }
    
    public static List<Estudiante> allEstudiantes() {

        String query = "SELECT * FROM Estudiante";

        List<Estudiante> estudiantes = new ArrayList<Estudiante>();

        try (
            Connection conn = Conexion.conectar();
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery()
        ) {

            while (rs.next()) {

                Estudiante estudiante = new Estudiante(
                    rs.getInt("clave"),
                    rs.getString("nombres"),
                    rs.getString("apellidos")
                );

                estudiantes.add(estudiante);
            }

        } catch (Exception e) {
            System.out.println("Error al consultar estudiantes: " + e);
            e.printStackTrace();
        }

        return estudiantes;
    }
    
    public static void updateEstudiante (Estudiante estudiante) {
        
        String query = "UPDATE Estudiante SET nombres = ?, apellidos = ? WHERE clave = ?";
        
        try (
            Connection conn = Conexion.conectar();
            PreparedStatement ps = conn.prepareStatement(query)
        ) {
            ps.setString(1, estudiante.getNombres());
            ps.setString(2, estudiante.getApellidos());
            ps.setInt(3, estudiante.getClave());

            ps.executeUpdate();

            System.out.println("Estudiante actualizado con exito");

        } catch (Exception e) {
            System.out.println("Algo fallo al actgualizar el estudiante: " + e);
            e.printStackTrace();
        }
    }
    
    public static void deleteEstudiante (int clave) {
        String query = "DELETE FROM Estudiante WHERE clave = ?";
        
        try (
            Connection conn = Conexion.conectar();
            PreparedStatement ps = conn.prepareStatement(query)
        ) {

            ps.setInt(1, clave);

            ps.executeUpdate();

            System.out.println("Estudiante eliminado con exito");

        } catch (Exception e) {
            System.out.println("Algo fallo al insertar el estudiante: " + e);
            e.printStackTrace();
        }
    }
    
}
