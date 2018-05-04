# Big O Notation - Java 
Busqueda binaria: Tiene complejidad logarítmica O(Log N)
Por ejemplo, si se tuviese un N = 30 (1 al 32, ordenado de menor a mayor).
El algoritmo iniciaria en el centro 16, como el nro buscado no es 16, sino mayor, elegimos nuestro nuevo rango de 17 a 32. 1 iteración.
En la segunda iteración, elegimos como centro 24 y como el nro buscado es mayor el rango a buscar ahora es de 25 a 32.
En la tercera iteración, elegimos como centro 28, como el nro buscado es mayor el rango a buscar es de 29 a 32.
En la cuarta iteración, elegimos como centro a 30, como el nro buscado es mayor el rango a buscar es de 31 a 32.
En la quinta iteración, elegimos como centro a 32, siendo este el nro buscado. Por tanto en el peor de los casos se tiene que recorrer 5 veces la lista, siendo el Log de 32 igual a 5, por tanto se generaliza la complejidad a una del tipo Logarítmica.

La serie fibonacci en su versión recursiva tiene una complejidad exponencial.
De la fórmula f(n) = f(n-1) + f(n-2).
Por cada iteración se genera dos ramas, y cada rama generará también 2 mas. 
Para n = 1, la complejidad es 1 = 2^(1-1).
Para n = 2, la complejidad es 2 = 2^(2-1).
Para n = 3, la complejidad es 4 = 2^(3-1).
Para n = 4, la complejidad es 8 = 2^(4-1).
Vemos que en general, para un n = N la complejidad se comporta como un 2^(N-1), es decir una complejidad O(2^N).
