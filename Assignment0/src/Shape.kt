abstract class Shape (_name : String) : Dimensional {
    var name = _name

    fun getArea() : Double{
        //return 0.0;
    }

    abstract fun setDimensions(dimensions: Double)

    abstract fun printDimensions()

}