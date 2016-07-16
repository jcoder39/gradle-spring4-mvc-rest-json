package name.bvv.rest.controller;

import org.springframework.web.bind.annotation.*;

/**
 * Created by v.borisenko on 08.05.14.
 */
@RestController
@RequestMapping("/example")
public class ExampleController
{

    @RequestMapping(value = "/hello/{name}", method = RequestMethod.GET, produces = "application/json")
    public String hello(
            @PathVariable("name") String name
    )
    {
        return "HELLO " + name;
    }

    @RequestMapping(value = "/main", method = RequestMethod.POST, produces = "application/json")
    public String main(
            @RequestBody String body
    )
    {
        return "BODY: " + body;
    }
}
