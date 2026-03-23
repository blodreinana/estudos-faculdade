public class Euro extends Moeda {

    public Euro(double valor) {
        this.valor = valor;
    }

    @Override
    public void info() {
        System.out.println("Euro - " + this.valor);
    }

    @Override
    public double converter() {
        return this.valor * 5.4;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Euro euro = (Euro) obj;
        return Double.compare(euro.valor, valor) == 0;
    }
}