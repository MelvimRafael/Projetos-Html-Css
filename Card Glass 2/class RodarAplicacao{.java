class RodarAplicacao{
    /**     * @param args
     */
    public static void main(String[] args) {
        Carro carro1 = new carro();

        carro1.setModelo("BMW");
        carro1.setCor("Azul");
        carro1.setCapacidadeTanque("65");

        Systen.out.println(carro1.getModelo());
        Systen.out.println(carro1.getCor());
        Systen.out.println(carro1.getCapacidadeTanque());
        Systen.out.println(carro1.totalvalor( valorGasolina