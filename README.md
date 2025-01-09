# solid-exercises

# Exercícios para Praticar os Princípios SOLID

Este repositório contém exercícios práticos para aprender e aplicar os princípios SOLID na programação orientada a objetos. Cada exercício está organizado em pacotes separados, com exemplos de implementação e explicações sobre como cada princípio foi seguido.

---

## Estrutura do Projeto

### Pacotes e Implementações

1. **SRP (Princípio da Responsabilidade Única)**
    - **Pacote:** `src.srp`
    - **Descrição:**  
      Implementação de classes com responsabilidades únicas para geração e envio de relatórios financeiros.
    - **Classes:**
        - `GerarRelatorio`: Responsável por gerar o relatório financeiro.
        - `EnviarPorEmail`: Gerencia o envio do relatório por e-mail.
        - `RelatorioFinanceiro`: Orquestra as operações de geração e envio.

2. **OCP (Princípio Aberto/Fechado)**
    - **Pacote:** `src.ocp`
    - **Descrição:**  
      Implementação de uma calculadora modular que permite a extensão de novas operações matemáticas sem alterar o código existente.
    - **Classes:**
        - `Operacao`: Interface para definir o contrato genérico de operações.
        - `Soma`, `Subtracao`, `Multiplicacao`: Implementações específicas de operações matemáticas.
        - `Calculadora`: Executa operações de forma genérica.
        - `Main`: Demonstra o uso da calculadora com diferentes operações.

3. **LSP (Princípio da Substituição de Liskov)**
    - **Pacote:** `src.lsp`
    - **Descrição:**  
      Implementação de formas geométricas que respeitam o contrato genérico de cálculo de área, garantindo substituibilidade.
    - **Classes:**
        - `Forma`: Interface para cálculo de área.
        - `Retangulo`: Implementação independente utilizando largura e altura.
        - `Main`: Demonstra o uso de formas genéricas.

4. **ISP (Princípio da Segregação de Interfaces)**
    - **Pacote:** `src.isp`
    - **Descrição:**  
      Implementação de interfaces específicas para diferentes responsabilidades, garantindo que as classes implementem apenas os métodos relevantes.
    - **Classes:**
        - `Funcionario`: Interface para responsabilidades gerais de funcionários.
        - `Desenvolvedor`: Interface para responsabilidades específicas de desenvolvedores.
        - `Programador`: Implementa a interface `Desenvolvedor`.
        - `Atendente`: Implementa a interface `Funcionario`.

5. **DIP (Princípio da Inversão de Dependência)**
    - **Pacote:** `src.dip`
    - **Descrição:**  
      Implementação de dispositivos de entrada genéricos, utilizando abstrações e injeção de dependência para garantir flexibilidade.
    - **Classes:**
        - `DispositivoEntrada`: Interface para dispositivos de entrada.
        - `Teclado`, `Mouse`: Implementações específicas de dispositivos de entrada.
        - `Computador`: Depende da abstração `DispositivoEntrada` via injeção de dependência.
        - `Main`: Demonstra o uso do sistema com diferentes dispositivos de entrada.

---