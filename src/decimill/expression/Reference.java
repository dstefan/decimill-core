package decimill.expression;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * @author David Stefan
 */
public class Reference {

    private final String namespace;
    private final String id;
    private final String field;
    
    public Reference(String namespace, String id) {
        this(namespace, id, null);
    }

    public Reference(String namespace, String id, String field) {
        this.namespace = namespace;
        this.id = id;
        this.field = field;
    }

    public String getNamespace() {
        return namespace;
    }

    public String getId() {
        return id;
    }
    
    public String getField() {
        return field;
    }
    
    public boolean hasField() {
        return field != null;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 41)
                .append(namespace)
                .append(id)
                .append(field)
                .toHashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Reference)) {
            return false;
        }
        Reference ref = (Reference) obj;
        return new EqualsBuilder().
                append(namespace, ref.getNamespace()).
                append(id, ref.getId()).
                append(field, ref.getField()).
                isEquals();
    }

    @Override
    public String toString() {
        return namespace + "." + id + (field != null ? "[" + field + "]" : "");
    }
}
