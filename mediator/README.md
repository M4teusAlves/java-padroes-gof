# Mediator

O padrão Mediator centraliza a comunicação entre objetos para reduzir o acoplamento direto entre eles. Isso facilita a manutenção e evolução do sistema.

# Explicação
1. MediadorCasaInteligente Interface: Define a interface para o mediador do sistema de casa inteligente, que pode notificar componentes sobre eventos.
2. MediadorCasaInteligenteImpl: Implementa a interface MediadorCasaInteligente e gerencia a comunicação entre os dispositivos da casa inteligente (luzes, termostato, cortinas).
3. Componente: Classe base para todos os componentes, que armazena uma referência ao mediador.
4. Luz: Componente que representa uma luz, que pode ser acesa ou apagada.
5. Termostato: Componente que representa um termostato, que pode ajustar a temperatura ou economizar energia.
6. Cortinas: Componente que representa cortinas, que podem ser abertas ou fechadas.
7. App: Classe principal que configura o mediador, cria os componentes e simula a interação entre eles.
# Funcionamento
1. Criação do Mediador: A classe MediadorCasaInteligenteImpl é instanciada para gerenciar a comunicação entre os dispositivos da casa inteligente.
2. Adição de Componentes: Componentes como Luz, Termostato e Cortinas são criados e configurados para usar o mediador.
3. Simulação de Operações: A classe principal simula a interação entre os dispositivos, demonstrando como o mediador coordena suas ações para gerenciar as condições da casa de maneira eficiente e coordenada.

Neste exemplo, quando a luz é acesa, o mediador ajusta o termostato e abre as cortinas. Quando a luz é apagada, o mediador ajusta o termostato para economizar energia e fecha as cortinas. O termostato e as cortinas também podem notificar o mediador de suas próprias ações, que por sua vez, coordena a resposta apropriada dos outros dispositivos.
