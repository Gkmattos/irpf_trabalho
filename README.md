# irpf_trabalho

Um sistema é usado para o cadastramento de
contribuintes (pessoas físicas) e cálculo do imposto de
renda. O cálculo pode ser feito visando a declaração
completa ou a declaração simplificada. Os dados
necessários para a declaração completa são:<br/>
• Nome*<br/>
• CPF*<br/>
• Idade**<br/>
• Número de dependentes**<br/>
• Contribuição previdenciária oficial***<br/>
• Total de rendimentos***<br/>
*Campos obrigatórios para todos os contribuintes<br/>
**Campos obrigatórios para os contribuintes que fazem declaração completa<br/>
***Campos obrigatórios para permitir o cálculo do imposto (qualquer<br/>
modalidade)<br/>
F.D.S. Faculdade de Informática/PUCRS 1<br/>
Cálculo do imposto (decl. simplificada)<br/>
• A base de cálculo é obtida descontando-se do total de rendimentos a contribuição previdenciária oficial.<br/>
• Aplica-se um desconto único de 5% sobre a base de cálculo.<br/>
• O imposto a pagar é obtido a partir da base de cálculo:<br/>
• Se a base de cálculo é de até R$ 12.000,00 então o contribuinte
está isento (imposto a pagar zero).<br/>
• Se a base de cálculo for maior que R$ 12.000,00 e inferior a R$
24.000,00, então o imposto a pagar corresponde a 15% do valor
da base de cálculo que excede o valor da faixa anterior.<br/>
• Se a base de cálculo for maior ou igual a R$ 24.000,00, então o
imposto a pagar é equivalente ao imposto devido na faixa anterior
mais 27,5% do valor da base de cálculo que excede a faixa
anterior.<br/>
F.D.S. Faculdade de Informática/PUCRS 2
Cálculo do imposto (declaração completa)<br/>
• A base de cálculo é obtida descontando-se do total de rendimentos a
contribuição previdenciária oficial.<br/>
• Em função da idade e do número de dependentes do contribuinte devese
aplicar um desconto sobre a base de cálculo.<br/>
• Para contribuintes com menos de 65 anos o desconto é de:<br/>
• 2% se o contribuinte tem até 2 dependentes<br/>
• 3,5% se contribuinte tem entre 3 e 5 dependentes<br/>
• 5% se o contribuinte tem mais de 5 dependentes<br/>
• Para contribuintes com 65 anos ou mais o desconto é de:<br/>
• 3% se o contribuinte tem até 2 dependentes<br/>
• 4,5% se contribuinte tem entre 3 e 5 dependentes<br/>
• 6% se o contribuinte tem mais de 5 dependentes<br/>
• O imposto a pagar é obtido a partir da base de cálculo:<br/>
• Se a base de cálculo é de até R$ 12.000,00 então o contribuinte está isento
(imposto a pagar zero).<br/>
• Se a base de cálculo for maior que R$ 12.000,00 e inferior a R$ 24.000,00, então o
imposto a pagar corresponde a 15% do valor da base de cálculo que excede o valor
da faixa anterior.<br/>
• Se a base de cálculo for maior ou igual a R$ 24.000,00, então o imposto a pagar é
equivalente ao imposto devido na faixa anterior mais 27,5% do valor da base de
cálculo que excede a faixa anterior.<br/>

Objetivo: continuar a refatorar o sistema do IRPF, agora aplicando o padrões adequados.

Descrição: Agora que seu código do IRPF está sendo desenvolvido em duas camadas lógicas, vamos avançar com a utilização de padrões. Assim, a partir do enunciado original e do código desenvolvido até agora:

- refatore o seu código para utilizar os padrões que julgar adequados. Em particular (mas não só), avalie como utilizar os padrões Strategy, Factory e Facade;

Entregável: seu código refatorado,  com os códigos de teste unitário utilizando JUNIT. 

Data: até 25/05, as 23:55.
