package cz.fi.muni.TACOS.rest;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * @author Pavel Vyskocil <vyskocilpavel@muni.cz>
 */
@ApplicationScoped
@ApplicationPath(ApiUris.REST_ROOT)
public class RestApplication extends Application {

	@Inject
	private SampleData sampleData;

	@PostConstruct
	public void init() {
		try {
			sampleData.loadSampleData();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
