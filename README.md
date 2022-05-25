# MST_Prim

## Explicación de las entrdas:
Para usar correctamente este programa se debe de tener en cuenta que la primer entrada es el número de vertices del grafo.
Ejemplo:
4
La segunda entrada es el número de aristas.
5
Las siguientes lineas serán según el número de aristas y deben ser ingresadas con valores enteros de la siguiente manera: 
0 1 2
0 2 3
0 3 1
2 3 2
3 1 4
Donde cada linea representa una arista, los dos primeros numeros son los vertices enlazados mientras que el tercer numero es el costo/peso.
Con los datos ingresados correctamente el programa arrojará una salida mostrando los enlaces y el peso del MST.

***Cabe recalcar que el número de vertices ingresados es un limite, por lo tanto el valor del vertice no puede ser igual o mayor al número total de vertices ya que lanzaría una excepción porque los valores de cada vertice cuentan desde 0.

## Ejemplo de entrada:
6

10

0 1 6
1 2 5
2 0 1
0 3 5
1 4 3
3 2 5
3 5 2
5 2 4
5 4 6
4 2 6
