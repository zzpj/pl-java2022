package pl.lodz.p.dns;

public class DomainLookupResolver {

	public DomainLookupResult resolve() {
		return Math.random() < 0.7 ? DomainLookupResult.SUCCESS : DomainLookupResult.FAILURE;
	}

}

