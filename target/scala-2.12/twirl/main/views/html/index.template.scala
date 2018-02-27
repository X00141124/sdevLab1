
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[models.Product],List[models.Category],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product], categories: List[models.Category], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.121*/("""

"""),_display_(/*3.2*/main("Products",user)/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""

"""),format.raw/*5.1*/("""<p class="lead">Product Catalogue</p>
<br>
<div class="row">
  <div class="col-sm-2">
    <h4>Categories</h4>
    <div class="list-group">
      <a href=""""),_display_(/*11.17*/routes/*11.23*/.HomeController.index(0)),format.raw/*11.47*/("""" class="list-group-item">All Categories</a>
      """),_display_(/*12.8*/for(c <- categories) yield /*12.28*/ {_display_(Seq[Any](format.raw/*12.30*/("""
        """),format.raw/*13.9*/("""<a href=""""),_display_(/*13.19*/routes/*13.25*/.HomeController.index(c.getId)),format.raw/*13.55*/("""" class="list-group-item">"""),_display_(/*13.82*/c/*13.83*/.getName),format.raw/*13.91*/("""
          """),format.raw/*14.11*/("""<span class="badge">"""),_display_(/*14.32*/c/*14.33*/.getProducts.size()),format.raw/*14.52*/("""</span>
        </a>
      """)))}),format.raw/*16.8*/("""
    """),format.raw/*17.5*/("""</div>
  </div>
  <div class="col-sm-10">
    <table class="table table-bordered table-hover table-condensed">
      """),_display_(/*21.8*/if(flash.containsKey("success"))/*21.40*/ {_display_(Seq[Any](format.raw/*21.42*/("""
        """),format.raw/*22.9*/("""<div class="alert alert-success">
          """),_display_(/*23.12*/flash/*23.17*/.get("success")),format.raw/*23.32*/("""
        """),format.raw/*24.9*/("""</div>
      """)))}),format.raw/*25.8*/("""
      """),format.raw/*26.7*/("""<thead>
        <tr>
          <th>Image</th>
          <th>ID</th>
          <th>Name</th>
          <th>Category</th>
          <th>Description</th>
          <th>Stock</th>
          <th>Price</th>
          <th colspan="2"></th>      
        </tr>
      </thead>

      <tbody>
        """),_display_(/*40.10*/for(p<-products) yield /*40.26*/ {_display_(Seq[Any](format.raw/*40.28*/("""
          """),format.raw/*41.11*/("""<tr>
            """),_display_(/*42.14*/if(env.resource("public/images/productImages/thumbnails/" + p.getId + ".jpg").isDefined)/*42.102*/ {_display_(Seq[Any](format.raw/*42.104*/("""
              """),format.raw/*43.15*/("""<td><img src="assets/images/productImages/thumbnails/"""),_display_(/*43.69*/(p.getId + ".jpg")),format.raw/*43.87*/(""""/></td>
            """)))}/*44.15*/else/*44.20*/{_display_(Seq[Any](format.raw/*44.21*/("""
              """),format.raw/*45.15*/("""<td><img src="assets/images/productImages/thumbnails/noImage.jpg"/></td>
            """)))}),format.raw/*46.14*/(""" 
            """),format.raw/*47.13*/("""<td class="numeric">"""),_display_(/*47.34*/p/*47.35*/.getId),format.raw/*47.41*/("""</td>
            <td>"""),_display_(/*48.18*/p/*48.19*/.getName),format.raw/*48.27*/("""</td>
            <td>"""),_display_(/*49.18*/p/*49.19*/.getCategory.getName),format.raw/*49.39*/("""</td>        
            <td>"""),_display_(/*50.18*/p/*50.19*/.getDescription),format.raw/*50.34*/("""</td>
            <td  class="numeric">"""),_display_(/*51.35*/p/*51.36*/.getStock),format.raw/*51.45*/("""</td>
            <td  class="numeric">€ """),_display_(/*52.37*/("%.2f".format(p.getPrice))),format.raw/*52.64*/("""</td>
            <td>
              <a href=""""),_display_(/*54.25*/routes/*54.31*/.HomeController.updateProduct(p.getId)),format.raw/*54.69*/("""" class="button xs btn-danger">
                <span class="glyphicon glyphicon-pencil"></span>
              </a>
            </td>        <td>
              <a href=""""),_display_(/*58.25*/routes/*58.31*/.HomeController.deleteProduct(p.getId)),format.raw/*58.69*/("""" class="button xs btn-danger" onclick="return confirmDel();">
                <span class="glyphicon glyphicon-trash"></span>
              </a>
            </td>
          </tr>
        """)))}),format.raw/*63.10*/("""
      """),format.raw/*64.7*/("""</tbody>

    </table>

    <p>
      <a href=""""),_display_(/*69.17*/routes/*69.23*/.HomeController.addProduct()),format.raw/*69.51*/("""">
        <button class="btn btn-primary">Add a product</button>
      </a>
    </p>
  </div>
</div>
""")))}),format.raw/*75.2*/("""
"""))
      }
    }
  }

  def render(products:List[models.Product],categories:List[models.Category],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(products,categories,user,env)

  def f:((List[models.Product],List[models.Category],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (products,categories,user,env) => apply(products,categories,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Feb 26 14:35:47 GMT 2018
                  SOURCE: /home/wdd/webapps/lab1/app/views/index.scala.html
                  HASH: f3e73b98dfbfc295049e660c4fd3eeb059bcd1cb
                  MATRIX: 1023->1|1238->120|1266->123|1295->144|1334->146|1362->148|1544->303|1559->309|1604->333|1682->385|1718->405|1758->407|1794->416|1831->426|1846->432|1897->462|1951->489|1961->490|1990->498|2029->509|2077->530|2087->531|2127->550|2185->578|2217->583|2361->701|2402->733|2442->735|2478->744|2550->789|2564->794|2600->809|2636->818|2680->832|2714->839|3033->1131|3065->1147|3105->1149|3144->1160|3189->1178|3287->1266|3328->1268|3371->1283|3452->1337|3491->1355|3532->1378|3545->1383|3584->1384|3627->1399|3744->1485|3786->1499|3834->1520|3844->1521|3871->1527|3921->1550|3931->1551|3960->1559|4010->1582|4020->1583|4061->1603|4119->1634|4129->1635|4165->1650|4232->1690|4242->1691|4272->1700|4341->1742|4389->1769|4463->1816|4478->1822|4537->1860|4734->2030|4749->2036|4808->2074|5028->2263|5062->2270|5137->2318|5152->2324|5201->2352|5334->2455
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|43->11|43->11|43->11|44->12|44->12|44->12|45->13|45->13|45->13|45->13|45->13|45->13|45->13|46->14|46->14|46->14|46->14|48->16|49->17|53->21|53->21|53->21|54->22|55->23|55->23|55->23|56->24|57->25|58->26|72->40|72->40|72->40|73->41|74->42|74->42|74->42|75->43|75->43|75->43|76->44|76->44|76->44|77->45|78->46|79->47|79->47|79->47|79->47|80->48|80->48|80->48|81->49|81->49|81->49|82->50|82->50|82->50|83->51|83->51|83->51|84->52|84->52|86->54|86->54|86->54|90->58|90->58|90->58|95->63|96->64|101->69|101->69|101->69|107->75
                  -- GENERATED --
              */
          