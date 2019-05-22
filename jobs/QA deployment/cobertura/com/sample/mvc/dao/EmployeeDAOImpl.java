<tr class="noCover">
<td class="line"><a name='1'/>1</td>
<td class="hits"/>
<td class="code">package&nbsp;com.sample.mvc.dao;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='2'/>2</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='3'/>3</td>
<td class="hits"/>
<td class="code">import&nbsp;java.util.List;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='4'/>4</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='5'/>5</td>
<td class="hits"/>
<td class="code">import&nbsp;org.hibernate.SessionFactory;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='6'/>6</td>
<td class="hits"/>
<td class="code">import&nbsp;org.springframework.beans.factory.annotation.Autowired;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='7'/>7</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='8'/>8</td>
<td class="hits"/>
<td class="code">import&nbsp;com.sample.mvc.model.EmployeeCommand;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='9'/>9</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="coverFull">
<td class="line"><a name='10'/>10</td>
<td class="hits">5</td>
<td class="code">public&nbsp;class&nbsp;EmployeeDAOImpl&nbsp;implements&nbsp;EmployeeDAO{</td>
</tr>
<tr class="noCover">
<td class="line"><a name='11'/>11</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='12'/>12</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;@Autowired</td>
</tr>
<tr class="noCover">
<td class="line"><a name='13'/>13</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;private&nbsp;SessionFactory&nbsp;sessionFactory;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='14'/>14</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='15'/>15</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;@Override</td>
</tr>
<tr class="noCover">
<td class="line"><a name='16'/>16</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;void&nbsp;addEmployee(EmployeeCommand&nbsp;employee)&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='17'/>17</td>
<td class="hits">1</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;this.sessionFactory.getCurrentSession().save(employee);</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='18'/>18</td>
<td class="hits">1</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='19'/>19</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='20'/>20</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;@Override</td>
</tr>
<tr class="noCover">
<td class="line"><a name='21'/>21</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;void&nbsp;deleteEmployee(Integer&nbsp;employeeId)&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='22'/>22</td>
<td class="hits">1</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;EmployeeCommand&nbsp;employee&nbsp;=&nbsp;(EmployeeCommand)&nbsp;sessionFactory.getCurrentSession().load(EmployeeCommand.class,&nbsp;employeeId);</td>
</tr>
<tr class="coverPart" title="Line 23: Conditional coverage 50% (1/2)">
<td class="line"><a name='23'/>23</td>
<td class="hits">1</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;if&nbsp;(null&nbsp;!=&nbsp;employee)&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='24'/>24</td>
<td class="hits">1</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;this.sessionFactory.getCurrentSession().delete(employee);</td>
</tr>
<tr class="noCover">
<td class="line"><a name='25'/>25</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='26'/>26</td>
<td class="hits">1</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='27'/>27</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='28'/>28</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;@Override</td>
</tr>
<tr class="noCover">
<td class="line"><a name='29'/>29</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;List&lt;EmployeeCommand&gt;&nbsp;listContact()&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='30'/>30</td>
<td class="hits">1</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;sessionFactory.getCurrentSession().createQuery("from&nbsp;EmployeeCommand").list();</td>
</tr>
<tr class="noCover">
<td class="line"><a name='31'/>31</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='32'/>32</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='33'/>33</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;@Override</td>
</tr>
<tr class="noCover">
<td class="line"><a name='34'/>34</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;EmployeeCommand&nbsp;getEmployeebyId(Integer&nbsp;employeeId)&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='35'/>35</td>
<td class="hits">1</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;EmployeeCommand&nbsp;empCmd&nbsp;=&nbsp;(EmployeeCommand)&nbsp;this.sessionFactory.getCurrentSession().get(EmployeeCommand.class,&nbsp;employeeId);</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='36'/>36</td>
<td class="hits">1</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;empCmd;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='37'/>37</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='38'/>38</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='39'/>39</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;@Override</td>
</tr>
<tr class="noCover">
<td class="line"><a name='40'/>40</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;void&nbsp;updateEmployee(EmployeeCommand&nbsp;employeeCommand)&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='41'/>41</td>
<td class="hits">1</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;this.sessionFactory.getCurrentSession().update(employeeCommand);</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='42'/>42</td>
<td class="hits">1</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='43'/>43</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='44'/>44</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='45'/>45</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='46'/>46</td>
<td class="hits"/>
<td class="code">}</td>
</tr>
