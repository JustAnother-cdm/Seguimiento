package com.example.empresaseguridad.model;


import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        PatrujalleMovil patrulla = null;
        Equipo equipoTemp = null;

        boolean activo = true;

        while (activo) {

            String opcion = JOptionPane.showInputDialog(
                    "SISTEMA EMPRESA DE SEGURIDAD\n\n" +
                            "1. Crear Patrulla Móvil\n" +
                            "2. Crear Equipo\n" +
                            "3. Asignar Equipo a Patrulla\n" +
                            "4. Mostrar Equipos de la Patrulla\n" +
                            "5. Salir\n\n" +
                            "Ingrese opción:"
            );

            if (opcion == null) return; // Cancelar cierra todo

            switch (opcion) {

                case "1":
                    patrulla = new PatrujalleMovil(
                            "CT001",
                            "Cliente X",
                            500000,
                            20,
                            3
                    );

                    JOptionPane.showMessageDialog(null,
                            "Patrulla creada:\n" +
                                    "Contrato: CT001\n" +
                                    "Cliente: Cliente X\n" +
                                    "Tarifa: 500000"
                    );
                    break;

                case "2":
                    equipoTemp = new Equipo(
                            "EQ01",
                            "Radio",
                            "Operativo",
                            300000,
                            0,
                            1
                    );

                    JOptionPane.showMessageDialog(null,
                            "Equipo creado:\n" +
                                    "Código: EQ01\n" +
                                    "Tipo: Radio\n" +
                                    "Valor Reposición: 300000"
                    );
                    break;

                case "3":
                    if (patrulla == null) {
                        JOptionPane.showMessageDialog(null,
                                "Primero debe crear una patrulla.");
                        break;
                    }
                    if (equipoTemp == null) {
                        JOptionPane.showMessageDialog(null,
                                "Primero debe crear un equipo.");
                        break;
                    }

                    patrulla.asignarEquipo(equipoTemp);

                    JOptionPane.showMessageDialog(null,
                            "Equipo asignado correctamente.");
                    break;

                case "4":
                    if (patrulla == null) {
                        JOptionPane.showMessageDialog(null,
                                "No hay patrulla creada.");
                        break;
                    }

                    if (patrulla.getEquipos().isEmpty()) {
                        JOptionPane.showMessageDialog(null,
                                "La patrulla no tiene equipos asignados.");
                        break;
                    }

                    StringBuilder sb = new StringBuilder("Equipos asignados:\n\n");
                    for (Equipo eq : patrulla.getEquipos()) {
                        sb.append(eq.getCod())
                                .append(" - ").append(eq.getTipo())
                                .append(" (").append(eq.getEstado()).append(")\n");
                    }

                    JOptionPane.showMessageDialog(null, sb.toString());
                    break;

                case "5":
                    activo = false;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        }
    }
}
