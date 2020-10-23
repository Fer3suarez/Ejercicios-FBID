## Ejercicios básicos Scala programación funcional.
### 1. Escribir una función firstp que tome dos argumentos, el primero un objeto y el segundo una lista, y que devuelva true si el primer argumento es igual al primer elemento del segundo argumento y false en caso contraro. Como ejemplo:
```
scala> firstp 'a' List('a', 'b', 'c')
res1: Boolean = true
scala > firstp "martes" List("lunes", "martes", "miercoles")
res2: Boolean = false
```
### 2. Escribir una función duplicar que tome como argumento una lista y devuelva la lista cuyos elementos son pares (lista de dos elementos) compuestos por los elementos de la primera. Tenga en cuenta que los elementos de la lista resultante son, a su vez, listas de dos elementos. Como ejemplo:
```
scala> duplicar(List('a'))
res3: List[List[String]] = List(List(a, a))
scala> duplicar(List('a', 'b', 'c'))
res4: List[List[String]] = List(List(a, a), List(b, b), List(c, c))
```
### 3. Escribir una función recursiva countdown que tome como argumento un número N positivo y genere una lista de enteros desde N hasta 1. Si se le pasa un número negativo o cero, debe devolver la lista vacía (List()). Como ejemplo:
```
scala> countdown(10)
res5: List[Int] = List(10, 9, 8, 7, 6, 5, 4, 3, 2, 1)
scala> countdown(-1)
res6: List[Int] = List()
```
### 4. Escribir una función reverse que tome como argumento una lista y devuelva la lista invertida. Es decir, con los elementos en el orden inverso al que aparecen en el original. Como ejemplo:
```
scala> reverse(List(1,2,3))
res7: List[Int] = List(3, 2, 1)
```
### 5. Escribir una función recursiva substitute que tome tres argumentos. Los dos primeros son dos instancias x e y y el tercero una lista ls. La función construye una nueva lista en la que todas las apariciones del elemento y se sustituyen por el símbolo x. Como ejemplo:
```
scala> substitute('a', 'b', List('a', 'b', 'c'))
res8: List[Char] = List(a, a, c)
scala> substitute('a', 'd', List('a', 'b', 'c'))
res9: List[Char] = List(a, b, c)
```
### 6. Escribir un predicado setequal que tome dos listas como argumentos y que devuelva true si todos los elementos de la primera lista están incluidos en la segunda y a la inversa. En caso contrario debe devolver false. Como ejemplo,
```
scala> setequal(List(1, 1, 2), List(1, 2))
res10: Boolean = true
scala> setequal(List(1, 1, 2), List(1, 2, 3))
res11: Boolean = false
scala> setequal(List(1, 2, 3), List(1, 2))
res12: Boolean = false
scala> setequal(List('a', 1), List(1, 'a')) // Funciona para tipos diferentes
res13: Boolean = true
```
### 7. Escribir una función impares que tome como argumento una lista y devuelva una lista formada por los elementos en las posiciones impares de la lista original. Como ejemplo:
```
scala> impares(List(1))
res14: List[Int] = List(1)
scala> impares(List(1,2,3,4,5,6))
res15: List[Int] = List(1, 3, 5)
```


> [Solución](https://github.com/Fer3suarez/Ejercicios-FBID/blob/main/ejercicios.scala)
