package com.siemens.heart.initialdata.setup;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.ArrayUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import com.siemens.heart.initialdata.constants.Heartb2bcommerceInitialDataConstants;

import de.hybris.platform.commerceservices.setup.AbstractSystemSetup;
import de.hybris.platform.core.initialization.SystemSetup;
import de.hybris.platform.core.initialization.SystemSetup.Process;
import de.hybris.platform.core.initialization.SystemSetup.Type;
import de.hybris.platform.core.initialization.SystemSetupContext;
import de.hybris.platform.core.initialization.SystemSetupParameter;
import de.hybris.platform.core.initialization.SystemSetupParameterMethod;

@SystemSetup(extension = Heartb2bcommerceInitialDataConstants.EXTENSIONNAME)
public class InitialDataSystemSetup extends AbstractSystemSetup {
    @Autowired
    private Environment environment;

    @Override
    @SystemSetupParameterMethod
    public List<SystemSetupParameter> getInitializationOptions() {
        final List<SystemSetupParameter> params = new ArrayList<SystemSetupParameter>();
        return params;
    }

    @SystemSetup(type = Type.ESSENTIAL, process = Process.ALL)
    public void createEssentialData(final SystemSetupContext context) {
        //
    }

    @SystemSetup(type = Type.PROJECT, process = Process.ALL)
    public void createProjectData(final SystemSetupContext context) {
		// logInfo(context, "<br/>Processing impex files:");
		// logInfo(context,
		// "<i><b>/heartb2bcommerceinitialdata/import/data/internal-order-groups.impex</b></i>");
		// importImpexFile(context,
		// "/heartb2bcommerceinitialdata/import/data/internal-order-groups.impex",
		// false);
		// logInfo(context,
		// "<i><b>/heartb2bcommerceinitialdata/import/data/essential-data.impex</b></i>");
		// importImpexFile(context,
		// "/heartb2bcommerceinitialdata/import/data/essential-data.impex",
		// false);
		// logInfo(context,
		// "<i><b>/heartb2bcommerceinitialdata/import/data/cron-jobs-init.impex</b></i>");
		// importImpexFile(context,
		// "/heartb2bcommerceinitialdata/import/data/cron-jobs-init.impex",
		// false);
		// logInfo(context,
		// "<i><b>/heartb2bcommerceinitialdata/import/data/cron-jobs.impex</b></i>");
		// importImpexFile(context,
		// "/heartb2bcommerceinitialdata/import/data/cron-jobs.impex", false);
		// logInfo(context,
		// "<i><b>/heartb2bcommerceinitialdata/import/data/countries.impex</b></i>");
		// importImpexFile(context,
		// "/heartb2bcommerceinitialdata/import/data/countries.impex", false);
		// logInfo(context,
		// "<i><b>/heartb2bcommerceinitialdata/import/data/delivery-modes.impex</b></i>");
		// importImpexFile(context,
		// "/heartb2bcommerceinitialdata/import/data/delivery-modes.impex",
		// false);
		// logInfo(context,
		// "<i><b>/heartb2bcommerceinitialdata/import/data/themes.impex</b></i>");
		// importImpexFile(context,
		// "/heartb2bcommerceinitialdata/import/data/themes.impex", false);
		//
		//
		//
		// logInfo(context, "<br/>Processing product catalog impex files:");
		// logInfo(context,
		// "<i><b>/heartb2bcommerceinitialdata/import/data/product/catalog.impex</b></i>");
		// importImpexFile(context,
		// "/heartb2bcommerceinitialdata/import/data/product/catalog.impex",
		// false);
		// logInfo(context,
		// "<i><b>/heartb2bcommerceinitialdata/import/data/product/categories.impex</b></i>");
		// importImpexFile(context,
		// "/heartb2bcommerceinitialdata/import/data/product/categories.impex",
		// false);
		//
		// logInfo(context, "<br/>Processing CPR impex files:");
		// logInfo(context,
		// "<i><b>/heartb2bcommerceinitialdata/import/data/cpr/siemens-instrument.impex</b></i>");
		// importImpexFile(context,
		// "/heartb2bcommerceinitialdata/import/data/cpr/siemens-instrument.impex",
		// false);
		// logInfo(context,
		// "<i><b>/heartb2bcommerceinitialdata/import/data/cpr/product-lines.impex</b></i>");
		// importImpexFile(context,
		// "/heartb2bcommerceinitialdata/import/data/cpr/product-lines.impex",
		// false);
		//
		// logInfo(context, "<br/>Processing content catalog impex files:");
		// logInfo(context,
		// "<i><b>/heartb2bcommerceinitialdata/import/data/content/catalog.impex</b></i>");
		// importImpexFile(context,
		// "/heartb2bcommerceinitialdata/import/data/content/catalog.impex",
		// false);
		// logInfo(context,
		// "<i><b>/heartb2bcommerceinitialdata/import/data/content/cms-content.impex</b></i>");
		// importImpexFile(context,
		// "/heartb2bcommerceinitialdata/import/data/content/cms-content.impex",
		// false);
		// logInfo(context,
		// "<i><b>/heartb2bcommerceinitialdata/import/data/content/email-content.impex</b></i>");
		// importImpexFile(context,
		// "/heartb2bcommerceinitialdata/import/data/content/email-content.impex",
		// false);
		// logInfo(context,
		// "<i><b>/heartb2bcommerceinitialdata/import/data/content/user/personalization.impex</b></i>");
		// importImpexFile(context,
		// "/heartb2bcommerceinitialdata/import/data/content/user/personalization.impex",
		// false);
		// logInfo(context,
		// "<i><b>/heartb2bcommerceinitialdata/import/data/content/media.impex</b></i>");
		// importImpexFile(context,
		// "/heartb2bcommerceinitialdata/import/data/content/media.impex",
		// false);
		// logInfo(context,
		// "<i><b>/heartb2bcommerceinitialdata/import/data/content/cmscockpit-access-rights.impex</b></i>");
		// importImpexFile(context,
		// "/heartb2bcommerceinitialdata/import/data/content/cmscockpit-access-rights.impex",
		// false);
		// logInfo(context,
		// "<i><b>/heartb2bcommerceinitialdata/import/data/content/help/contextual-help_en.impex</b></i>");
		// importImpexFile(context,
		// "/heartb2bcommerceinitialdata/import/data/content/help/contextual-help_en.impex",
		// false);
		//
		// logInfo(context, "<br/>Processing store impex files:");
		// logInfo(context,
		// "<i><b>/heartb2bcommerceinitialdata/import/data/store/store.impex</b></i>");
		// importImpexFile(context,
		// "/heartb2bcommerceinitialdata/import/data/store/store.impex", false);
		// logInfo(context,
		// "<i><b>/heartb2bcommerceinitialdata/import/data/store/site.impex</b></i>");
		// importImpexFile(context,
		// "/heartb2bcommerceinitialdata/import/data/store/site.impex", false);
		// logInfo(context,
		// "<i><b>/heartb2bcommerceinitialdata/import/data/store/site_en.impex</b></i>");
		// importImpexFile(context,
		// "/heartb2bcommerceinitialdata/import/data/store/site_en.impex",
		// false);
		// logInfo(context,
		// "<i><b>/heartb2bcommerceinitialdata/import/data/store/solr.impex</b></i>");
		// importImpexFile(context,
		// "/heartb2bcommerceinitialdata/import/data/store/solr.impex", false);
		// logInfo(context,
		// "<i><b>/heartb2bcommerceinitialdata/import/data/store/solr-post.impex</b></i>");
		// importImpexFile(context,
		// "/heartb2bcommerceinitialdata/import/data/store/solr-post.impex",
		// false);

        String[] activeProfiles = environment.getActiveProfiles();
        if (ArrayUtils.contains(activeProfiles, "schedulingAgreement")) {
            logInfo(context, "<br/>Scheduling Agreements enabled.");
        } else {
            logInfo(context, "<br/>Disable Scheduling Agreements:");
            logInfo(context, "<i><b>/heartb2bcommerceinitialdata/import/data/content/schedulingAgreementDisable.impex</b></i>");
            importImpexFile(context, "/heartb2bcommerceinitialdata/import/data/content/schedulingAgreementDisable.impex", false);
        }

        logInfo(context, "<br/><b>Synchronizing SIEMENS Product Catalog</b>");
        createProductCatalogSyncJob(context, "SIEMENSProductCatalog");
        executeCatalogSyncJob(context, "SIEMENSProductCatalog");
        logInfo(context, "<br/><b>Synchronizing SIEMENS Content Catalog</b>");
        createContentCatalogSyncJob(context, "SIEMENSContentCatalog");
        executeCatalogSyncJob(context, "SIEMENSContentCatalog");

        logInfo(context, "<br/><b>Executing SOLR Products index</b>");
        createSolrIndexerCronJobs("SIEMENSIndex");
        executeSolrIndexerCronJob("SIEMENSIndex", true);

        logInfo(context, "<br/><b>Executing SOLR Orders index</b>");
        createSolrIndexerCronJobs("SIEMENSOrdersIndex");
        executeSolrIndexerCronJob("SIEMENSOrdersIndex", true);

    }

}
