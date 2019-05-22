<tr class="noCover">
<td class="line"><a name='1'/>1</td>
<td class="hits"/>
<td class="code">package&nbsp;com.sample.mvc.controller;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='2'/>2</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='3'/>3</td>
<td class="hits"/>
<td class="code">import&nbsp;java.net.InetAddress;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='4'/>4</td>
<td class="hits"/>
<td class="code">import&nbsp;java.net.UnknownHostException;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='5'/>5</td>
<td class="hits"/>
<td class="code">import&nbsp;java.util.Map;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='6'/>6</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='7'/>7</td>
<td class="hits"/>
<td class="code">import&nbsp;org.apache.commons.logging.Log;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='8'/>8</td>
<td class="hits"/>
<td class="code">import&nbsp;org.apache.commons.logging.LogFactory;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='9'/>9</td>
<td class="hits"/>
<td class="code">import&nbsp;org.springframework.beans.factory.annotation.Autowired;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='10'/>10</td>
<td class="hits"/>
<td class="code">import&nbsp;org.springframework.stereotype.Controller;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='11'/>11</td>
<td class="hits"/>
<td class="code">import&nbsp;org.springframework.ui.Model;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='12'/>12</td>
<td class="hits"/>
<td class="code">import&nbsp;org.springframework.web.bind.annotation.ModelAttribute;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='13'/>13</td>
<td class="hits"/>
<td class="code">import&nbsp;org.springframework.web.bind.annotation.PathVariable;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='14'/>14</td>
<td class="hits"/>
<td class="code">import&nbsp;org.springframework.web.bind.annotation.RequestMapping;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='15'/>15</td>
<td class="hits"/>
<td class="code">import&nbsp;org.springframework.web.bind.annotation.RequestMethod;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='16'/>16</td>
<td class="hits"/>
<td class="code">import&nbsp;org.springframework.web.servlet.ModelAndView;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='17'/>17</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='18'/>18</td>
<td class="hits"/>
<td class="code">import&nbsp;com.google.gson.Gson;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='19'/>19</td>
<td class="hits"/>
<td class="code">import&nbsp;com.sample.mvc.model.EmployeeCommand;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='20'/>20</td>
<td class="hits"/>
<td class="code">import&nbsp;com.sample.mvc.model.LogMessage;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='21'/>21</td>
<td class="hits"/>
<td class="code">import&nbsp;com.sample.mvc.service.EmployeeService;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='22'/>22</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='23'/>23</td>
<td class="hits"/>
<td class="code">@Controller</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='24'/>24</td>
<td class="hits">5</td>
<td class="code">public&nbsp;class&nbsp;EmployeeController&nbsp;{</td>
</tr>
<tr class="noCover">
<td class="line"><a name='25'/>25</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;@Autowired</td>
</tr>
<tr class="noCover">
<td class="line"><a name='26'/>26</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;private&nbsp;EmployeeService&nbsp;employeeService;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='27'/>27</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="coverFull">
<td class="line"><a name='28'/>28</td>
<td class="hits">5</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;private&nbsp;Log&nbsp;logger&nbsp;=&nbsp;LogFactory.getLog(EmployeeController.class);</td>
</tr>
<tr class="noCover">
<td class="line"><a name='29'/>29</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='30'/>30</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;String&nbsp;logMessage(String&nbsp;method,&nbsp;String&nbsp;resourcePath)&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='31'/>31</td>
<td class="hits">7</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;LogMessage&nbsp;logMessage&nbsp;=&nbsp;new&nbsp;LogMessage();</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='32'/>32</td>
<td class="hits">7</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;logMessage.setApplicationName("EMSapplication");</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='33'/>33</td>
<td class="hits">7</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;logMessage.setContinerHostName(System.getenv("HOST_NAME"));</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='34'/>34</td>
<td class="hits">7</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;logMessage.setEcsCluster(System.getenv("ECS_CLUSTER"));</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='35'/>35</td>
<td class="hits">7</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;logMessage.setHttpMethod(method);</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='36'/>36</td>
<td class="hits">7</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;logMessage.setResourcePath(resourcePath);</td>
</tr>
<tr class="noCover">
<td class="line"><a name='37'/>37</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;try&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='38'/>38</td>
<td class="hits">7</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;logMessage.setServerAddress(InetAddress.getLocalHost().toString());</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='39'/>39</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;catch&nbsp;(UnknownHostException&nbsp;e)&nbsp;{</td>
</tr>
<tr class="noCover">
<td class="line"><a name='40'/>40</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;//&nbsp;TODO&nbsp;Auto-generated&nbsp;catch&nbsp;block</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='41'/>41</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;e.printStackTrace();</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='42'/>42</td>
<td class="hits">7</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='43'/>43</td>
<td class="hits">7</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Gson&nbsp;gson&nbsp;=&nbsp;new&nbsp;Gson();</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='44'/>44</td>
<td class="hits">7</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;gson.toJson(logMessage);</td>
</tr>
<tr class="noCover">
<td class="line"><a name='45'/>45</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='46'/>46</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='47'/>47</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;@RequestMapping(value&nbsp;=&nbsp;"/home",&nbsp;method&nbsp;=&nbsp;RequestMethod.GET)</td>
</tr>
<tr class="noCover">
<td class="line"><a name='48'/>48</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;String&nbsp;viewHome()&nbsp;throws&nbsp;UnknownHostException&nbsp;{</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='49'/>49</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;logger.info(logMessage("GET",&nbsp;"/home"));</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='50'/>50</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;"home";</td>
</tr>
<tr class="noCover">
<td class="line"><a name='51'/>51</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='52'/>52</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='53'/>53</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;@RequestMapping("/list")</td>
</tr>
<tr class="noCover">
<td class="line"><a name='54'/>54</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;String&nbsp;listContacts(Map&lt;String,&nbsp;Object&gt;&nbsp;map)&nbsp;throws&nbsp;UnknownHostException&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='55'/>55</td>
<td class="hits">1</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;map.put("contact",&nbsp;new&nbsp;EmployeeCommand());</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='56'/>56</td>
<td class="hits">1</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;map.put("contactList",&nbsp;employeeService.listContact());</td>
</tr>
<tr class="noCover">
<td class="line"><a name='57'/>57</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="coverFull">
<td class="line"><a name='58'/>58</td>
<td class="hits">1</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;logger.info(logMessage("GET",&nbsp;"/list"));</td>
</tr>
<tr class="noCover">
<td class="line"><a name='59'/>59</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="coverFull">
<td class="line"><a name='60'/>60</td>
<td class="hits">1</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;"list";</td>
</tr>
<tr class="noCover">
<td class="line"><a name='61'/>61</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='62'/>62</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='63'/>63</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;@RequestMapping(value&nbsp;=&nbsp;"/jsp/add",&nbsp;method&nbsp;=&nbsp;RequestMethod.POST)</td>
</tr>
<tr class="noCover">
<td class="line"><a name='64'/>64</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;ModelAndView&nbsp;addEmployee(@ModelAttribute&nbsp;EmployeeCommand&nbsp;employeeCommand)&nbsp;throws&nbsp;UnknownHostException&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='65'/>65</td>
<td class="hits">3</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;employeeService.addEmployee(employeeCommand);</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='66'/>66</td>
<td class="hits">3</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;logger.info(logMessage("POST",&nbsp;"/add"));</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='67'/>67</td>
<td class="hits">3</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;new&nbsp;ModelAndView("redirect:/list");</td>
</tr>
<tr class="noCover">
<td class="line"><a name='68'/>68</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='69'/>69</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='70'/>70</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;@RequestMapping(value&nbsp;=&nbsp;"/edit/{code}")</td>
</tr>
<tr class="noCover">
<td class="line"><a name='71'/>71</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;String&nbsp;getEmployeeById(@PathVariable("code")&nbsp;Integer&nbsp;empCode,&nbsp;Model&nbsp;model)&nbsp;throws&nbsp;UnknownHostException&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='72'/>72</td>
<td class="hits">1</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;EmployeeCommand&nbsp;employee&nbsp;=&nbsp;employeeService.getEmployeebyId(empCode);</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='73'/>73</td>
<td class="hits">1</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;model.addAttribute("employee",&nbsp;employee);</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='74'/>74</td>
<td class="hits">1</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;logger.info(logMessage("GET",&nbsp;"/edit"));</td>
</tr>
<tr class="noCover">
<td class="line"><a name='75'/>75</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="coverFull">
<td class="line"><a name='76'/>76</td>
<td class="hits">1</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;"edit";</td>
</tr>
<tr class="noCover">
<td class="line"><a name='77'/>77</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='78'/>78</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='79'/>79</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;@RequestMapping(value&nbsp;=&nbsp;"/edit/update",&nbsp;method&nbsp;=&nbsp;RequestMethod.POST)</td>
</tr>
<tr class="noCover">
<td class="line"><a name='80'/>80</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;String&nbsp;updateEmployee(@ModelAttribute&nbsp;EmployeeCommand&nbsp;employeeCommand)&nbsp;throws&nbsp;UnknownHostException&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='81'/>81</td>
<td class="hits">1</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;employeeService.updateEmployee(employeeCommand);</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='82'/>82</td>
<td class="hits">1</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;logger.info(logMessage("POST",&nbsp;"/edit/update"));</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='83'/>83</td>
<td class="hits">1</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;"redirect:/list";</td>
</tr>
<tr class="noCover">
<td class="line"><a name='84'/>84</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='85'/>85</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='86'/>86</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;@RequestMapping(value&nbsp;=&nbsp;"/delete/{employeeId}")</td>
</tr>
<tr class="noCover">
<td class="line"><a name='87'/>87</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;String&nbsp;deleteEmplyee(@PathVariable("employeeId")&nbsp;Integer&nbsp;employeeId)&nbsp;throws&nbsp;UnknownHostException&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='88'/>88</td>
<td class="hits">1</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;employeeService.deleteEmployee(employeeId);</td>
</tr>
<tr class="noCover">
<td class="line"><a name='89'/>89</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="coverFull">
<td class="line"><a name='90'/>90</td>
<td class="hits">1</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;logger.info(logMessage("GET",&nbsp;"/delete"));</td>
</tr>
<tr class="noCover">
<td class="line"><a name='91'/>91</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="coverFull">
<td class="line"><a name='92'/>92</td>
<td class="hits">1</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;"redirect:/list";</td>
</tr>
<tr class="noCover">
<td class="line"><a name='93'/>93</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='94'/>94</td>
<td class="hits"/>
<td class="code">}</td>
</tr>
