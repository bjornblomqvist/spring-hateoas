package org.springframework.hateoas.hal;


import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Class to maintain relations whose links must always be serialized as an array regardless of cardinality.
 *
 * In HAL, if there is only one link behind a rel, it can be serialized directly into a link object; otherwise
 * the links behind the rel are serialized into an array of link objects.
 *
 * However, the HAL specification says that links behind certain rels can always be represented as an array
 * regardless of cardinality. This class helps you do that. If a rel is specified here, links under it will
 * always be serialized into an array across all resources.
 *
 * @author Vivin Paliath
 */
public class HalMultipleLinkRels {

	private final Set<String> rels;

	public HalMultipleLinkRels(String... rels) {
		this.rels = new HashSet<String>(Arrays.asList(rels));
	}

	public Set<String> getRels() {
		return Collections.unmodifiableSet(rels);
	}
}
