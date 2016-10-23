# irpf_trabalho
esse é o trabalho do professor michael mora

Um sistema é usado para o cadastramento de
contribuintes (pessoas físicas) e cálculo do imposto de
renda. O cálculo pode ser feito visando a declaração
completa ou a declaração simplificada. Os dados
necessários para a declaração completa são:
• Nome*
• CPF*
• Idade**
• Número de dependentes**
• Contribuição previdenciária oficial***
• Total de rendimentos***
*Campos obrigatórios para todos os contribuintes
**Campos obrigatórios para os contribuintes que fazem declaração completa
***Campos obrigatórios para permitir o cálculo do imposto (qualquer
modalidade)
F.D.S. Faculdade de Informática/PUCRS 1
Cálculo do imposto (decl. simplificada)
• A base de cálculo é obtida descontando-se do total de
rendimentos a contribuição previdenciária oficial.
• Aplica-se um desconto único de 5% sobre a base de
cálculo.
• O imposto a pagar é obtido a partir da base de cálculo:
• Se a base de cálculo é de até R$ 12.000,00 então o contribuinte
está isento (imposto a pagar zero).
• Se a base de cálculo for maior que R$ 12.000,00 e inferior a R$
24.000,00, então o imposto a pagar corresponde a 15% do valor
da base de cálculo que excede o valor da faixa anterior.
• Se a base de cálculo for maior ou igual a R$ 24.000,00, então o
imposto a pagar é equivalente ao imposto devido na faixa anterior
mais 27,5% do valor da base de cálculo que excede a faixa
anterior.
F.D.S. Faculdade de Informática/PUCRS 2
Cálculo do imposto (declaração completa)
• A base de cálculo é obtida descontando-se do total de rendimentos a
contribuição previdenciária oficial.
• Em função da idade e do número de dependentes do contribuinte devese
aplicar um desconto sobre a base de cálculo.
• Para contribuintes com menos de 65 anos o desconto é de:
• 2% se o contribuinte tem até 2 dependentes
• 3,5% se contribuinte tem entre 3 e 5 dependentes
• 5% se o contribuinte tem mais de 5 dependentes
• Para contribuintes com 65 anos ou mais o desconto é de:
• 3% se o contribuinte tem até 2 dependentes
• 4,5% se contribuinte tem entre 3 e 5 dependentes
• 6% se o contribuinte tem mais de 5 dependentes
• O imposto a pagar é obtido a partir da base de cálculo:
• Se a base de cálculo é de até R$ 12.000,00 então o contribuinte está isento
(imposto a pagar zero).
• Se a base de cálculo for maior que R$ 12.000,00 e inferior a R$ 24.000,00, então o
imposto a pagar corresponde a 15% do valor da base de cálculo que excede o valor
da faixa anterior.
• Se a base de cálculo for maior ou igual a R$ 24.000,00, então o imposto a pagar é
equivalente ao imposto devido na faixa anterior mais 27,5% do valor da base de
cálculo que excede a faixa anterior.



Objetivo: introduzir a noção de camadas.

Descrição: Agora que seu código do IRPF foi desenvolvido/iniciado, vamos re-organizá-lo. O objetivo é separar suas classes em dois pacotes distintos (duas camadas lógicas). Assim:

     - crie dois pacotes: irpf.interface e irpf.nogocio.

     - re-organize suas classes, de forma que todas as classes/funcionalidades relativas à interface com usuário estejam na camada interface (pacote irpf.interface) e que todas as classes referentes as entidades do problema (entidades de negócio) estejam na camada negocio (pacote irpf.negocio)

     - ao fazer esta distribuição, tente minimizar o acoplamento entre classes;

     - ao fazer esta distribuição, algumas questões podem surgir:

             - algumas classes podem não ser claramente de interface ou de negócio. Onde elas ficam?

             - se alguma das suas classes continha aspectos de interface e negocio, ela deve ser dividida;

             - como deve ser a interação entre classes que estão em camadas diferentes;

             - onde de estar a classe que contém o main()

Observações: o produto trabalhado hoje deve ser aproveitado na próxima aula. Assim, é importante avançar com seu desenvolvimento o máximo que for possível. Após a atividade que será desenvolvida na quinta-feira, este exercício deve ser entregue (na próxima segunda). Assim, é importante que avancemos o que for possível nas atividades desta semana.

