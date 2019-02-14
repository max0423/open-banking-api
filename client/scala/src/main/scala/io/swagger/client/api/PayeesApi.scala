/**
 * Consumer Data Standards
 * API sets created by the Australian Consumer Data Standards to meet the needs of the Consumer Data Right
 *
 * OpenAPI spec version: 1-oas3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api

import java.text.SimpleDateFormat

import io.swagger.client.model.ResponseBankingPayeeDetails
import io.swagger.client.model.ResponseBankingPayees
import io.swagger.client.{ApiInvoker, ApiException}

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date
import java.util.TimeZone

import scala.collection.mutable.HashMap

import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

import java.net.URI

import com.wordnik.swagger.client.ClientResponseReaders.Json4sFormatsReader._
import com.wordnik.swagger.client.RequestWriters.Json4sFormatsWriter._

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent._
import scala.concurrent.duration._
import scala.util.{Failure, Success, Try}

import org.json4s._

class PayeesApi(
  val defBasePath: String = "https://data.provider.com.au/cds-au/v1",
  defApiInvoker: ApiInvoker = ApiInvoker
) {
  private lazy val dateTimeFormatter = {
    val formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    formatter.setTimeZone(TimeZone.getTimeZone("UTC"))
    formatter
  }
  private val dateFormatter = {
    val formatter = new SimpleDateFormat("yyyy-MM-dd")
    formatter.setTimeZone(TimeZone.getTimeZone("UTC"))
    formatter
  }
  implicit val formats = new org.json4s.DefaultFormats {
    override def dateFormatter = dateTimeFormatter
  }
  implicit val stringReader: ClientResponseReader[String] = ClientResponseReaders.StringReader
  implicit val unitReader: ClientResponseReader[Unit] = ClientResponseReaders.UnitReader
  implicit val jvalueReader: ClientResponseReader[JValue] = ClientResponseReaders.JValueReader
  implicit val jsonReader: ClientResponseReader[Nothing] = JsonFormatsReader
  implicit val stringWriter: RequestWriter[String] = RequestWriters.StringWriter
  implicit val jsonWriter: RequestWriter[Nothing] = JsonFormatsWriter

  var basePath: String = defBasePath
  var apiInvoker: ApiInvoker = defApiInvoker

  def addHeader(key: String, value: String): mutable.HashMap[String, String] = {
    apiInvoker.defaultHeaders += key -> value
  }

  val config: SwaggerConfig = SwaggerConfig.forUrl(new URI(defBasePath))
  val client = new RestClient(config)
  val helper = new PayeesApiAsyncHelper(client, config)

  /**
   * Get Payee Detail
   * Obtain detailed information on a single payee
   *
   * @param payeeId The ID used to locate the details of a particular payee 
   * @return ResponseBankingPayeeDetails
   */
  def getPayeeDetail(payeeId: String): Option[ResponseBankingPayeeDetails] = {
    val await = Try(Await.result(getPayeeDetailAsync(payeeId), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get Payee Detail asynchronously
   * Obtain detailed information on a single payee
   *
   * @param payeeId The ID used to locate the details of a particular payee 
   * @return Future(ResponseBankingPayeeDetails)
   */
  def getPayeeDetailAsync(payeeId: String): Future[ResponseBankingPayeeDetails] = {
      helper.getPayeeDetail(payeeId)
  }

  /**
   * Get Payees
   * Obtain a list of pre-registered payees
   *
   * @param `type` Filter on the payee type field.  In addition to normal type field values, ALL can be specified to retrieve all payees.  If absent the assumed value is ALL (optional)
   * @param page Page of results to request (standard pagination) (optional)
   * @param pageSize Page size to request. Default is 25 (standard pagination) (optional)
   * @return ResponseBankingPayees
   */
  def listPayees(`type`: Option[String] = None, page: Option[Integer] = None, pageSize: Option[Integer] = None): Option[ResponseBankingPayees] = {
    val await = Try(Await.result(listPayeesAsync(`type`, page, pageSize), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get Payees asynchronously
   * Obtain a list of pre-registered payees
   *
   * @param `type` Filter on the payee type field.  In addition to normal type field values, ALL can be specified to retrieve all payees.  If absent the assumed value is ALL (optional)
   * @param page Page of results to request (standard pagination) (optional)
   * @param pageSize Page size to request. Default is 25 (standard pagination) (optional)
   * @return Future(ResponseBankingPayees)
   */
  def listPayeesAsync(`type`: Option[String] = None, page: Option[Integer] = None, pageSize: Option[Integer] = None): Future[ResponseBankingPayees] = {
      helper.listPayees(`type`, page, pageSize)
  }

}

class PayeesApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def getPayeeDetail(payeeId: String)(implicit reader: ClientResponseReader[ResponseBankingPayeeDetails]): Future[ResponseBankingPayeeDetails] = {
    // create path and map variables
    val path = (addFmt("/banking/payees/{payeeId}")
      replaceAll("\\{" + "payeeId" + "\\}", payeeId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (payeeId == null) throw new Exception("Missing required parameter 'payeeId' when calling PayeesApi->getPayeeDetail")


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def listPayees(`type`: Option[String] = None,
    page: Option[Integer] = None,
    pageSize: Option[Integer] = None
    )(implicit reader: ClientResponseReader[ResponseBankingPayees]): Future[ResponseBankingPayees] = {
    // create path and map variables
    val path = (addFmt("/banking/payees"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    `type` match {
      case Some(param) => queryParams += "type" -> param.toString
      case _ => queryParams
    }
    page match {
      case Some(param) => queryParams += "page" -> param.toString
      case _ => queryParams
    }
    pageSize match {
      case Some(param) => queryParams += "page-size" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}