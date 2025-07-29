package questoes_de_prova.questao54;

// Ordem de execução
public class Tst {
    // 1°
    int ini = 0, fim = 25;

    // Executada Apenas quando a função for chamada
    void print() {
        System.out.println(ini+fim);
    }

    // 2°
    {
        ini = fim % 7;
        fim = ini * 3;
    }
    // 4° Construtores são os ultimos a serem executados
    Tst(int a, int b) {
        ini += a;
        fim += b;
    }

    // 3°
    {
        ini /= 2;
        fim += 10;
    }
}
