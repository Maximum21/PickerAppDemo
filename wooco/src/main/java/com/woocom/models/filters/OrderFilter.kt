package com.woocom.models.filters

class OrderFilter : ListFilter() {

    var parent: IntArray? = null
        set(parent) {
            field = parent
            if (parent != null) {
                addFilter("parent", parent)
            }
        }
    var parent_exclude: IntArray? = null
        set(parent_exclude) {
            field = parent_exclude

            if (parent_exclude != null) {
                addFilter("parent_exclude", parent_exclude)
            }
        }

    internal lateinit var status: String
    internal lateinit var accepted_by: String

    internal var customer: Int = 0
    internal var filter: Int = -1
    internal var product: Int = 0
    internal var dp: Int = 0

    fun getStatus(): String {
        return status
    }

    fun setStatus(status: String) {
        this.status = status

        addFilter("status", status)
    }

    fun getCustomer(): Int {
        return customer
    }

    fun setCustomer(customer: Int) {
        this.customer = customer

        addFilter("customer", customer)
    }
    fun setAccepted(customer: Int) {
        this.filter = customer

        addFilter("accepted", customer)
    }
    fun setAcceptedBy(customer: String) {
        this.accepted_by = customer

        addFilter("accepted_by", customer)
    }

    fun getProduct(): Int {
        return product
    }

    fun setProduct(product: Int) {
        this.product = product

        addFilter("product", product)
    }

    fun getDp(): Int {
        return dp
    }

    fun setDp(dp: Int) {
        this.dp = dp
        addFilter("dp", dp)

    }
}
