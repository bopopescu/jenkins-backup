<tr class="noCover">
<td class="line"><a name='1'/>1</td>
<td class="hits"/>
<td class="code">package&nbsp;com.sample.mvc.service;</td>
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
<td class="code">import&nbsp;com.sample.mvc.model.EmployeeCommand;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='6'/>6</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='7'/>7</td>
<td class="hits"/>
<td class="code">public&nbsp;interface&nbsp;EmployeeService&nbsp;{</td>
</tr>
<tr class="noCover">
<td class="line"><a name='8'/>8</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;void&nbsp;addEmployee(EmployeeCommand&nbsp;employee);</td>
</tr>
<tr class="noCover">
<td class="line"><a name='9'/>9</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;List&lt;EmployeeCommand&gt;&nbsp;listContact();</td>
</tr>
<tr class="noCover">
<td class="line"><a name='10'/>10</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;void&nbsp;deleteEmployee(Integer&nbsp;employeeId);</td>
</tr>
<tr class="noCover">
<td class="line"><a name='11'/>11</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;EmployeeCommand&nbsp;getEmployeebyId(Integer&nbsp;employeeId);</td>
</tr>
<tr class="noCover">
<td class="line"><a name='12'/>12</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;void&nbsp;updateEmployee(EmployeeCommand&nbsp;employeeCommand);</td>
</tr>
<tr class="noCover">
<td class="line"><a name='13'/>13</td>
<td class="hits"/>
<td class="code">}</td>
</tr>
