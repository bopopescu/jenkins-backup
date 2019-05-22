<tr class="noCover">
<td class="line"><a name='1'/>1</td>
<td class="hits"/>
<td class="code">package&nbsp;com.sample.mvc.model;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='2'/>2</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='3'/>3</td>
<td class="hits"/>
<td class="code">import&nbsp;javax.persistence.Column;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='4'/>4</td>
<td class="hits"/>
<td class="code">import&nbsp;javax.persistence.Entity;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='5'/>5</td>
<td class="hits"/>
<td class="code">import&nbsp;javax.persistence.Id;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='6'/>6</td>
<td class="hits"/>
<td class="code">import&nbsp;javax.persistence.Table;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='7'/>7</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='8'/>8</td>
<td class="hits"/>
<td class="code">@Entity</td>
</tr>
<tr class="noCover">
<td class="line"><a name='9'/>9</td>
<td class="hits"/>
<td class="code">@Table(name&nbsp;=&nbsp;"employee")</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='10'/>10</td>
<td class="hits">18</td>
<td class="code">public&nbsp;class&nbsp;EmployeeCommand&nbsp;{</td>
</tr>
<tr class="noCover">
<td class="line"><a name='11'/>11</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='12'/>12</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='13'/>13</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;@Id</td>
</tr>
<tr class="noCover">
<td class="line"><a name='14'/>14</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;@Column(name&nbsp;=&nbsp;"code")</td>
</tr>
<tr class="noCover">
<td class="line"><a name='15'/>15</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;int&nbsp;code;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='16'/>16</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='17'/>17</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;@Column(name&nbsp;=&nbsp;"name")</td>
</tr>
<tr class="noCover">
<td class="line"><a name='18'/>18</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;private&nbsp;String&nbsp;name;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='19'/>19</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='20'/>20</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;@Column(name&nbsp;=&nbsp;"city")</td>
</tr>
<tr class="noCover">
<td class="line"><a name='21'/>21</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;private&nbsp;String&nbsp;city;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='22'/>22</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='23'/>23</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;String&nbsp;getName()&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='24'/>24</td>
<td class="hits">1</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;name;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='25'/>25</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='26'/>26</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='27'/>27</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;void&nbsp;setName(String&nbsp;name)&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='28'/>28</td>
<td class="hits">15</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;this.name&nbsp;=&nbsp;name;</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='29'/>29</td>
<td class="hits">15</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='30'/>30</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='31'/>31</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;int&nbsp;getCode()&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='32'/>32</td>
<td class="hits">1</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;code;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='33'/>33</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='34'/>34</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='35'/>35</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;void&nbsp;setCode(int&nbsp;code)&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='36'/>36</td>
<td class="hits">15</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;this.code&nbsp;=&nbsp;code;</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='37'/>37</td>
<td class="hits">15</td>
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
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;String&nbsp;getCity()&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='40'/>40</td>
<td class="hits">2</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;city;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='41'/>41</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='42'/>42</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='43'/>43</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;void&nbsp;setCity(String&nbsp;city)&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='44'/>44</td>
<td class="hits">15</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;this.city&nbsp;=&nbsp;city;</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='45'/>45</td>
<td class="hits">15</td>
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
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;@Override</td>
</tr>
<tr class="noCover">
<td class="line"><a name='48'/>48</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;String&nbsp;toString()&nbsp;{</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='49'/>49</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;"Employee&nbsp;[code="&nbsp;+&nbsp;code&nbsp;+&nbsp;",&nbsp;name="&nbsp;+&nbsp;name&nbsp;+&nbsp;",&nbsp;city="&nbsp;+&nbsp;city&nbsp;+&nbsp;"]";</td>
</tr>
<tr class="noCover">
<td class="line"><a name='50'/>50</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='51'/>51</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='52'/>52</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='53'/>53</td>
<td class="hits"/>
<td class="code">}</td>
</tr>
