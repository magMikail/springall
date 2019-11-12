package com.magmik.tests;

//from spgmvc project

public class ProductControllerTest {
//    @Mock //Mockito Mock object
//    private ProductService productService;
//
//    @InjectMocks //setups up controller, and injects mock objects into it.
//    private ProductController productController;
//
//    private MockMvc mockMvc;
//
//    @Before
//    public void setup(){
//        MockitoAnnotations.initMocks(this); //initilizes controller and mocks
//
//        mockMvc = MockMvcBuilders.standaloneSetup(productController).build();
//    }
//
//    @Test
//    public void testList() throws Exception{
//
//        List<Product> products = new ArrayList<>();
//        products.add(new Product());
//        products.add(new Product());
//
//        //specific Mockito interaction, tell stub to return list of products
//        when(productService.listAllProducts()).thenReturn((List) products); //need to strip generics to keep Mockito happy.
//
//        mockMvc.perform(get("/product/list"))
//                .andExpect(status().isOk())
//                .andExpect(view().name("product/list"))
//                .andExpect(model().attribute("products", hasSize(2)));
//    }

}
