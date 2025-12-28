public sealed interface Shape permits Circle, Square, Triangle {
    double area();
}
