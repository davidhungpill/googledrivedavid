<template>

    <v-card outlined>
        <v-card-title>
            DisplayDashboard # {{$route.params.id }}
        </v-card-title>

        <v-card-text>
            <div>
                <String label="FileStatus" v-model="item.fileStatus" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Number label="FileSize" v-model="item.fileSize" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Boolean label="IsIndexed" v-model="item.isIndexed" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="StreamingUrl" v-model="item.streamingUrl" :editMode="editMode" @change="change" />
            </div>
        </v-card-text>
    </v-card>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: 'DisplayDashboardViewDetail',
    props: {
      value: Object,
    },
    data: () => ({
        item : [],
    }),
    async created() {
      var params = this.$route.params;
      var temp = await axios.get(axios.fixUrl('/displayDashboards/' + params.id))

      this.item = temp.data;

    },
    methods: {
    }
  }
</script>

