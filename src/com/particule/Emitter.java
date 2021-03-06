package gameengine.particule;

import gameengine.entities.GameObject;
import gameengine.physic.Point2D;

import java.util.ArrayList;
import java.util.List;

/**
 * Class representing a emitter that emitte particles.
 * @author Main
 *
 */
public abstract class Emitter extends GameObject{
	private List<Particle> lstParticule = new ArrayList<>();
	public List<Particle> getLstParticule() {
		return lstParticule;
	}
	public abstract List<Particle> emit(Point2D position);
}
