# robocode

Radarbot

As estratégias desse robô consiste em:

Ao iniciar a batalha ele irá escanear toda a arena em busca de um alvo
Quando localizar o alvo, se esse alvo estiver acima de 100 pixels de distância, ele irá apenas atirar em direção do alvo e tentar se aproximar
Caso a 2º etapa seja concluída, quando ele chega em menos de 100 pixels de distância, ele irá perseguir o adversário com o canhão, atirando balas com 3x o poder
E por fim, caso ele encoste no alvo, e tenha energia o suficiente, ele irá lançar um tiro com 10x o poder

As estratégias de defesa são bem simples, caso ele seja acertado por uma bala, irá tentar desviar das demais fazendo curvas para a esquerda
E caso ele bata numa parede, ele virará 90º graus e andará 100px
