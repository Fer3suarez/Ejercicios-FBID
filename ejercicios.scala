object Main extends App{
    
    def firstp(x:Any, lista:List[Any]):Boolean = {
    	if (lista.isEmpty) false
    	else if (x == lista.head) true
    	else false
    }
    
    def duplicar(lista:List[Any]):List[Any] = {
    	if (lista.isEmpty) lista
    	else List(lista.head, lista.head) :: duplicar(lista.tail)
    }
    
    def countdown(x:Int): List[Int] = {
    	if (x > 0) x :: countdown(x-1)
    	else List()
    }
    
    def reverse(lista:List[Any]): List[Any] = {
    	if (lista.isEmpty) lista
    	else reverse(lista.tail) :: List(lista.head)
    }
    
    def substitute(x:Any, y:Any, lista:List[Any]): List[Any] = {
    	if (!lista.contains(y)) lista
    	else if (y == lista.head) x :: substitute(x, y, lista.tail)
    	else lista.head :: substitute(x, y, lista.tail)
    }
    
    def setequal(lista1: List[Any], lista2: List[Any]): Boolean ={
    	lista1.forall(a => lista2.contains(a)) && lista2.forall(b => lista1.contains(b))
    }
    
    def impares(lista: List[Any]): List[Any] = {
    	if (lista.isEmpty || (lista.tail).isEmpty) lista
    	else lista.head :: impares((lista.tail).tail)
    }
    

    //TODOS LOS DATOS SON LOS EJEMPLOS DEL ENUNCIADO
    
    val lista = List("a","b","c")
    val lista1 = List("lunes", "martes", "miercoles")
    println("FIRSTP DEBE DAR TRUE -> " + firstp("a", lista))
    println("FIRSTP DEBE DAR FALSE -> " + firstp("martes", lista1))
    
    val lista2 = List("a")
    val lista3 = List("a","b","c")
    println("DUPLICAR DEBE DAR List(List(a, a)) -> " + duplicar(lista2))
    println("DUPLICAR DEBE DAR List(List(a, a), List(b, b), List(c, c)) -> " + duplicar(lista3))
    
    val num = 10
    val num1 = -1
    println("COUNTDOWN DEBE DAR List(10, 9, 8, 7, 6, 5, 4, 3, 2, 1) -> " + countdown(num))
    println("COUNTDOWN DEBE DAR List() -> " + countdown(num1))
    
    val lista4 = List(1,2,3)
    println("REVERSE DEBE DAR List(3, 2, 1) -> " + reverse(lista4))
    
    val num2 = "a"
    val num3 = "b"
    val lista5 = List("a","b","c")
    val num4 = "d"
    println("SUBSTITUTE DEBE DAR List(a, a, c) -> " + substitute(num2, num3, lista5))
    println("SUBSTITUTE DEBE DAR List(a, b, c) -> " + substitute(num2, num4, lista5))
    
    val lista6 = List(1,1,2)
    val lista7 = List(1,2)
    val lista8 = List(1,2,3)
    val lista9 = List("a",1)
    val lista10 = List(1,"a")
    println("SETEQUAL DEBE DAR true -> " + setequal(lista6, lista7))
    println("SETEQUAL DEBE DAR false -> " + setequal(lista6, lista8))
    println("SETEQUAL DEBE DAR false -> " + setequal(lista8, lista7))
    println("SETEQUAL DEBE DAR true -> " + setequal(lista9, lista10))
    
    val lista11 = List(1)
    val lista12 = List(1,2,3,4,5,6)
    println("IMPARES DEBE DAR List(1) -> " + impares(lista11))
    println("IMPARES DEBE DAR List(1, 3, 5) -> " + impares(lista12))
    
}   

