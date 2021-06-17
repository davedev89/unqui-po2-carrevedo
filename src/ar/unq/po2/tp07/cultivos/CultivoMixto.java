package ar.unq.po2.tp07.cultivos;

import java.util.ArrayList;
import java.util.List;

public class CultivoMixto extends Cultivo{
	
	List<Cultivo> cultivos;

	public CultivoMixto() {
		this.setCultivos(new ArrayList<Cultivo>());
	}

	public List<Cultivo> getCultivos() {
		return cultivos;
	}
	
	private void setCultivos(List<Cultivo> cultivos) {
		this.cultivos = cultivos;
	}
	
	public void agregarCultivo(Cultivo cultivo) {
		if (this.getCultivos().size() < 4) {
			this.getCultivos().add(cultivo);
		}
	}
	
	public void removerCultivo(Cultivo cultivo) {
		this.getCultivos().remove(cultivo);
	}
	
	@Override
	public Float getGanancia() {
		return this.getCultivos().stream().map(c -> c.getGanancia() / 4).reduce(0f, (a, b) -> a + b);
	}

}