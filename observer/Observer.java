package observer;

public interface Observer {

    void update();

    void update(int newState, int oldState);
}
