<template>

    <v-data-table
        :headers="headers"
        :items="displayDashboard"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'DisplayDashboardView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
                { text: "fileStatus", value: "fileStatus" },
                { text: "fileSize", value: "fileSize" },
                { text: "isIndexed", value: "isIndexed" },
                { text: "streamingUrl", value: "streamingUrl" },
            ],
            displayDashboard : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/displayDashboards'))

            temp.data._embedded.displayDashboards.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.displayDashboard = temp.data._embedded.displayDashboards;
        },
        methods: {
        }
    }
</script>

