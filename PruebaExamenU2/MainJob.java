package PruebaExamenU2;

import java.util.Scanner;

public class MainJob {
    public static void main(String[] args) {
        ArrayQueue<Job> queue = new ArrayQueue<>();
        ArrayStack<Job> stack = new ArrayStack<>();
        SingleLinkedList log = new SingleLinkedList();

        Scanner sc = new Scanner(System.in);
        while (true) {
            String line = sc.nextLine().trim().toUpperCase();
            if (line.isEmpty()) continue;

            String[] parts = line.split("\\s+");
            String command = parts[0];

            switch (command) {
                case "ADD":
                    if (parts.length < 2) {
                        System.out.println("Falta ID de trabajo");
                    } else {
                        queue.offer(new Job(parts[1]));
                    }
                    break;

                case "PROCESS":
                    if (parts.length < 2) {
                        System.out.println("Número inválido");
                        break;
                    }
                    try {
                        int n = Integer.parseInt(parts[1]);
                        for (int i = 0; i < n; i++) {
                            Job job = queue.poll();
                            if (job != null) stack.push(job);
                        }
                    } catch (Exception e) {
                        System.out.println("Número inválido");
                    }
                    break;

                case "COMMIT":
                    while (!stack.isEmpty()) {
                        log.add(stack.pop());
                    }
                    break;

                case "ROLLBACK":
                    if (parts.length < 2) {
                        System.out.println("Número inválido");
                        break;
                    }
                    try {
                        int m = Integer.parseInt(parts[1]);
                        int count = Math.min(m, log.size());
                        for (int i = 0; i < count; i++) {
                            Job job = log.removeLast();
                            if (job != null) queue.addFront(job);
                        }
                    } catch (Exception e) {
                        System.out.println("Número inválido");
                    }
                    break;

                case "PRINT":
                    System.out.println("QUEUE (pendientes):");
                    queue.print();
                    System.out.println("STACK (procesando):");
                    stack.print();
                    System.out.println("BITÁCORA (confirmados):");
                    log.print();
                    break;

                case "END":
                    System.out.println("--- ESTADO FINAL ---");
                    System.out.print("QUEUE (pendientes): ");
                    queue.print();
                    System.out.print("STACK (procesando): ");
                    stack.print();
                    System.out.print("BITÁCORA (confirmados): ");
                    log.print();
                    return;

                default:
                    System.out.println("Comando no reconocido");
            }
        }
    }
}
