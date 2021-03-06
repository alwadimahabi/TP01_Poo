package ca.csf.formes;

import java.awt.Shape;

/**
 * Représente un rectangle 2D.
 * 
 * @see ElementGraphique
 */
public class Rectangle extends Forme {
	
	/**
	 * Instancie 
	 */
	public Rectangle() {
		this(0, 0, 0, 0);
	}
	
	/**
	 * 
	 * @param p_X
	 * @param p_Y
	 */
	public Rectangle(double p_X, double p_Y) {
		this(p_X, p_Y, 0, 0);
	}
	
	/**
	 * 
	 * @param p_X coordonnée en x.
	 * @param p_Y coordonnée en y.
	 * @param p_Largeur largeur.
	 * @param p_Hauteur hauteur.
	 */
	public Rectangle(double p_X, double p_Y, double p_Largeur, double p_Hauteur) {
		super("Rectangle", p_X, p_Y, p_Largeur, p_Hauteur);
	}


	
	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Shape getShape() {
		double x = Math.min(this.getX(), this.getX() + this.getLargeur());
		double y = Math.min(this.getY(), this.getY() + this.getHauteur());
		double largeur = Math.abs(this.getLargeur());
		double hauteur = Math.abs(this.getHauteur());
		return new java.awt.Rectangle.Double(x, y, largeur, hauteur);
	}
}
