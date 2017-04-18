package ru.sample2.server;


import ru.sample2.shared.SuggestionDTO;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;


/**
 * The server side implementation of the Rest service.
 */

@Path("/country")
public class EndPointImpl {

  private static final long serialVersionUID = 1L;
  private AddressesRepository countryRepository;

  @Inject
  public EndPointImpl(AddressesRepository countryRepository) {
    super();
    this.countryRepository = countryRepository;
  }

  @GET
  @Path("/{country}")
  @Produces("application/json")
  public SuggestionDTO getCountryList(@PathParam("country") final String input)  {

    return countryRepository.getCountryList(input);

  }

}
