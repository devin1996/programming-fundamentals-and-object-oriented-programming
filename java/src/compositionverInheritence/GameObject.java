/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositionverInheritence;

/**
 *
 * @author User
 */
public class GameObject implements IVisible, IUpdatable, ICollidable {

    private final IVisible _visible;
    private final IUpdatable _updatable;
    private final ICollidable _collidable;

    public GameObject(IVisible _visible, IUpdatable _updatable, ICollidable _collidable) {
        this._visible = _visible;
        this._updatable = _updatable;
        this._collidable = _collidable;
    }

    GameObject() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Draw() {
        _visible.Draw();
    }

    @Override
    public void update() {
        _updatable.update();
    }

    @Override
    public void Collide() {
        _collidable.Collide();
    }

}
