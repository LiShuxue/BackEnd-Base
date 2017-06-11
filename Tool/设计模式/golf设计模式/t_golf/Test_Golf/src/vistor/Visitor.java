package vistor;

import java.util.Collection;

import vistor.impl.FloatElement;
import vistor.impl.StringElement;

public interface Visitor {

	public void visitString(StringElement stringE);

	public void visitFloat(FloatElement floatE);

	public void visitCollection(Collection collection);
}