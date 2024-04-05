package Heroes;
	public class SuperHero extends Persona {

		public SuperHero(String nombre, String ciudad, int edad, String nombreS, String poder) {
				super(nombre, ciudad, edad);
				this.nombreS = nombreS;
				this.poder = poder;
			}
		protected String nombreS;
		protected String poder;
		public String getNombreS() {
			return nombreS;
		}
		public void setNombreS(String nombreS) {
			this.nombreS = nombreS;
		}
		public String getPoderes() {
			return poder;
		}
		public void setPoder(String poder) {
			this.poder = poder;
		}
}
