package org.springframework.cloud.config.monitor;

/**
 * Simple abstraction of a list of paths that changed in a repository.
 *
 * @author Dave Syer
 *
 */
public class PropertyPathNotification {

	private String[] paths;

	public PropertyPathNotification(String... paths) {
		this.paths = paths;
	}

	public PropertyPathNotification() {
	}

	public String[] getPaths() {
		return this.paths;
	}

	public void setPaths(String[] paths) {
		this.paths = paths;
	}

	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (!(o instanceof PropertyPathNotification)) {
			return false;
		}
		final PropertyPathNotification other = (PropertyPathNotification) o;
		if (!other.canEqual(this)) {
			return false;
		}
		if (!java.util.Arrays.deepEquals(this.getPaths(), other.getPaths())) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		result = result * PRIME + java.util.Arrays.deepHashCode(this.getPaths());
		return result;
	}

	protected boolean canEqual(Object other) {
		return other instanceof PropertyPathNotification;
	}

	public String toString() {
		return "PropertyPathNotification(paths=" + java.util.Arrays.deepToString(this.getPaths()) + ")";
	}

}
