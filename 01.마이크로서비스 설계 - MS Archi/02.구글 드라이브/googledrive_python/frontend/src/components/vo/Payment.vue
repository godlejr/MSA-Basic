<template>
    <div>
        <v-card style="width:300px; margin-left:5%;" outlined>
            
            <v-card-title>
                Payment
            </v-card-title>
            <v-card-text style = "margin-left:-15px; margin-top:10px;">
                <div class="grey--text ml-4" v-if="editMode" style = "margin-top:-20px;">
                    <v-text-field label="PaymentType" v-model="value.paymentType"/>
                </div>
                <div class="grey--text ml-4" v-else>
                    PaymentType :  
                </div>
                <div class="grey--text ml-4" v-if="editMode" style = "margin-top:-20px;">
                    <v-text-field label="Amount" v-model="value.amount"/>
                </div>
                <div class="grey--text ml-4" v-else>
                    Amount :  
                </div>
            </v-card-text>
        
        </v-card>
    </div>
</template>

<script>
export default {
    name:"Payment",
    props: {
        editMode: Boolean,
        value : Object,
    },


    data: () => ({
        date: new Date().toISOString().substr(0, 10),
    }),
    
    
}
</script>

<style scoped>
    .address-v-card-title {
        display: contents;
    }
    .address-v-text-field {
        margin-top:5px;
    }
</style>