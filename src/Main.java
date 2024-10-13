import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hiddenNumber = new Random().nextInt(100) + 1;
        int tentativas = 0;

        String mensagemInicial = """
                ═══════════════════════════════════════════════════════
                      🌟 Bem-vindos ao The Hidden Number! 🌟
                
                   🧠 Prepare-se para um desafio de mente afiada!
                   🔍 Seu objetivo: Adivinhar um número entre 1 e 100!
                
                   ❓ Será que você consegue desmascarar o número
                      oculto e provar que é o mestre das adivinhações?
                
                   🚀 Dica: Mantenha a calma, e confie na sua intuição!
                   Boa sorte! Que a sorte (e a lógica) esteja com você!
                
                ═══════════════════════════════════════════════════════
                   🔥 Atenção! Você tem no máximo 5 tentativas! 🔥
                ═══════════════════════════════════════════════════════
                """;

        String mensagemEscolha = """
                ═══════════════════════════════════════════════════════
                    🎯 Escolha um número entre 1 e 100! 🎯
                    🔍 Escreva seu número e tente a sorte!
                ═══════════════════════════════════════════════════════
                """;

        String mensagemMaior = """
                ═══════════════════════════════════════════════════════
                    ⏩ O número é maior! ⏩
                
                    🔍 Continue tentando e busque o número escondido! 🔍
                    Você está cada vez mais perto! Vá em frente! 🚀
                
                    🎯 Escolha um número entre 1 e 100! 🎯
                ═══════════════════════════════════════════════════════
                """;

        String mensagemMenor = """
                ═══════════════════════════════════════════════════════
                    ⏪ O número é menor! ⏪
                
                    🔍 Continue tentando e busque o número escondido! 🔍
                    Você está quase lá! Não desista! 🚀
                
                    🎯 Escolha um número entre 1 e 100! 🎯
                ═══════════════════════════════════════════════════════
                """;

        String mensagemFim = """
                ═══════════════════════════════════════════════════════
                    😢 Infelizmente, você não conseguiu acertar! 😢
                    🚫 Você esgotou suas 5 tentativas. O número era: %d".
                
                    🔍 Não desanime! Cada tentativa é uma oportunidade de aprender!
                    🎯 Tente novamente e desafie-se mais uma vez! 🎯
                ═══════════════════════════════════════════════════════
                """.formatted(hiddenNumber);

        System.out.println(mensagemInicial);
        System.out.println(mensagemEscolha);

        while (tentativas < 5) {
            int usuarioNumero = scanner.nextInt();
            tentativas++;

            if (usuarioNumero == hiddenNumber) {
                String mensagemAcertou = """
                ═══════════════════════════════════════════════════════
                    🎉 Parabéns! Você acertou o número! 🎉
                
                    🎯 O número correto era: %d ! 🎯
                
                    🏆 Você precisou de %d tentativa(s) para acertar! 🏆
                
                    👏 Sua intuição estava afiada hoje! 👏
                ═══════════════════════════════════════════════════════
                """.formatted(hiddenNumber, tentativas);

                System.out.println(mensagemAcertou);
                break;
            } else if (tentativas == 5 && usuarioNumero != hiddenNumber) {
                System.out.println(mensagemFim);
            } else if (hiddenNumber > usuarioNumero) {
                System.out.println(mensagemMaior);
            } else {
                System.out.println(mensagemMenor);
            }
        }
    }
}
